package telia.hw.service.horse;

import lombok.Data;

import java.io.Serializable;

@Data
public class HorseInfoResponse implements Serializable {
    private Integer id;
    private String name;
    private String color;
}
