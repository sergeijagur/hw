package telia.hw.domain.horse;

import lombok.Data;

import java.io.Serializable;

@Data
public class HorseInfoRequest implements Serializable {
    private final Integer userId;
    private final String name;
    private final String color;
}
