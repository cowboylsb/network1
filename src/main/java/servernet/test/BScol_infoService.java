package servernet.test;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BScol_infoService {

    @Autowired
    private BScol_infoRepository BScol_infoRepository;

    public BScol_info saveBscolInfo(BScol_infoDTO bscolInfoDTO) {
        GeoJsonPoint location = new GeoJsonPoint(bscolInfoDTO.getLongitude(), bscolInfoDTO.getLatitude());
        List<BS_infoDTO> bsInfoList = bscolInfoDTO.getBsInfoList();
        LocalDateTime date = LocalDateTime.now();

        BScol_info bscolInfo = new BScol_info(location, bsInfoList, date);
        return BScol_infoRepository.save(bscolInfo);
    }
}
