package servernet.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BS_infoDTO {
    private String CI;
    private String PCI;
    private int frequency;
    private int RSRP;
    private int RSRQ;
    private int SINR;

    public BS_infoDTO(String CI, String PCI, int frequency, int RSRP, int RSRQ, int SINR) {
        this.CI = CI;
        this.PCI = PCI;
        this.frequency = frequency;
        this.RSRP = RSRP;
        this.RSRQ = RSRQ;
        this.SINR = SINR;
    }
}
