package telia.hw.domain.horse;

import lombok.Data;

import java.io.Serializable;

@Data
public class RaceHorse implements Serializable {
    private final Integer id;
    private final String name;
    private final String color;
}
