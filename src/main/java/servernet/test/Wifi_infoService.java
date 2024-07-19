package servernet.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

@Service
public class Wifi_infoService {

    @Autowired
    private Wifi_infoRepository Wifi_infoRepository;

    public Wifi_info saveWifi_info(double latitude, double longitude, double altitude, String BSSID, int RSSI, int Frequency, String Label){
        Wifi_info wifi_info = new Wifi_info();
        wifi_info.setLocation(new GeoJsonPoint(longitude, latitude));
        wifi_info.setAltitude(altitude);
        wifi_info.setBssid(BSSID);
        wifi_info.setRssi(RSSI);
        wifi_info.setFrequency(Frequency);
        wifi_info.setLabel(Label);
        return Wifi_infoRepository.save(wifi_info);
    }
}
