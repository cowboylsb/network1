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
@RequestMapping("/api/wifi_info")
public class Wifi_infoController {

    private static final Log log = LogFactory.getLog(Wifi_infoController.class);
    @Autowired
    private Wifi_infoRepository Wifi_infoRepository;
    @Autowired
    private Wifi_infoService Wifi_infoService;

    // 모든 사용자 조회
    @GetMapping
    public List<Wifi_info> getAllWifi_infos() {
        return Wifi_infoRepository.findAll();
    }

    // 특정 ID의 사용자 조회
    @GetMapping("/{id}")
    public Wifi_info getWifi_infoById(@PathVariable String id) {
        return Wifi_infoRepository.findById(id).orElse(null);
    }
    @GetMapping("/name/{name}")
    public List<Wifi_info> getWifi_infoByBssid(@PathVariable String bssid) {
        return Wifi_infoRepository.findByBssid(bssid);
    }

    // 새로운 사용자 추가
    @PostMapping
    public List<Wifi_info> addWifi_info(@RequestBody List<Wifi_infoDTO> wifi_infos) {
        return wifi_infos.stream().map(dto -> Wifi_infoService.saveWifi_info(dto.getLatitude(), dto.getLongitude(), dto.getAltitude(), dto.getBssid(), dto.getRssi(), dto.getFrequency(), dto.getLabel())).collect(Collectors.toList());
    }

    // 사용자 정보 업데이트
    @PutMapping("/{id}")
    public Wifi_info updateWifi_info(@PathVariable String id, @RequestBody Wifi_info wifi_info) {
        return Wifi_infoRepository.save(wifi_info);
    }

    // 사용자 삭제
    @DeleteMapping("/{id}")
    public void deleteWifi_info(@PathVariable String id) {
        Wifi_infoRepository.deleteById(id);
    }
}
