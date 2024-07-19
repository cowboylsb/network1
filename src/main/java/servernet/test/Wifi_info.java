package servernet.test;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "test")
public class Wifi_info {

    @Id
    private String id;
    @Field("location")
    private GeoJsonPoint location;
    @Field("altitude")
    private double altitude;
    @Field("bssid")
    private String bssid;
    @Field("rssi")
    private int rssi;
    @Field("frequency")
    private int frequency;
    @Field("label")
    private String label;

// 생성자
    public Wifi_info() {}

    public Wifi_info(GeoJsonPoint location, double altitude, String bssid, int rssi, int frequency, String label) {
        this.location = location;
        this.altitude = altitude;
        this.bssid = bssid;
        this.rssi = rssi;
        this.frequency = frequency;
        this.label = label;
    }

    @Override
    public String toString() {
        return "Wifi_info{" +
                "id='" + id + '\'' +
                ", location=" + location +
                ", altitude=" + altitude +
                ", BSSID='" + bssid + '\'' +
                ", RSSI=" + rssi +
                ", Frequency=" + frequency +
                ", Label='" + label + '\'' +
                '}';
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}