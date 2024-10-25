package servernet.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BS_infoDTO {
    private String id;
    private int frequency;
    private int rsrp;

    public BS_infoDTO(String id, int frequency, int rsrp) {
        this.id = id;
        this.frequency = frequency;
        this.rsrp = rsrp;
    }
}
