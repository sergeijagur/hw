package telia.hw.service.race;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
public class RaceInfoRequest implements Serializable {
    private final Integer userId;
    private final String name;
    private final String place;
    private final LocalDate date;

}
