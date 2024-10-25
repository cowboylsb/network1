package servernet.test;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Document(collection = "BS_info")
public class BScol_info {
    @Id
    private String id;
    @Field("location")
    private GeoJsonPoint location;
    @Field("ap_info_list")
    private List<BS_infoDTO> bsInfoList;
    @Field("date")
    private LocalDateTime date;

    // 생성자
    public BScol_info() {}

    public BScol_info(GeoJsonPoint location, List<BS_infoDTO> bsInfoList, LocalDateTime date) {
        this.location = location;
        this.bsInfoList = bsInfoList;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Wifi_info{" +
                "id='" + id + '\'' +
                ", location=" + location +
                ", apInfoList=" + bsInfoList +
                ", date='" + date + '\'' +
                '}';
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public void setDate(LocalDateTime date) {
        ZonedDateTime utcZonedDateTime = date.atZone(ZoneId.of("UTC"));
        ZonedDateTime kstZonedDateTime = utcZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        this.date = kstZonedDateTime.toLocalDateTime();
    }
}
