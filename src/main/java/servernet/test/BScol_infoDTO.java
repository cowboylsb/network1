package servernet.test;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class BScol_infoDTO {
    private double latitude;
    private double longitude;
    private List<BS_infoDTO> bsInfoList;

    public BScol_infoDTO(double latitude, double longitude, List<BS_infoDTO> bsInfoList) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.bsInfoList = bsInfoList;
    }

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

    public List<BS_infoDTO> getBsInfoList() {
        return bsInfoList;
    }
}
