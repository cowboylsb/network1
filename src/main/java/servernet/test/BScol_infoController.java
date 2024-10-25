package servernet.test;

import ch.qos.logback.classic.spi.ILoggingEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/BScol_info")
public class BScol_infoController {

    @Autowired
    private BScol_infoRepository BScol_infoRepository;
    @Autowired
    private BScol_infoService BScol_infoService;

    // 새로운 추가
    @PostMapping
    public BScol_info addBScolInfo(@RequestBody BScol_infoDTO bscolInfoDTO) {
        System.out.println("data complete");
        return BScol_infoService.saveBscolInfo(bscolInfoDTO);
    }
}
