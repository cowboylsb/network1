package servernet.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wifi_infoDTO {
    private double latitude;
    private double longitude;
    private double altitude;
    private String bssid;
    private int rssi;
    private int frequency;
    private String label;

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getBssid() {
        return bssid;
    }
    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public int getRssi() {
        return rssi;
    }
    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
}
