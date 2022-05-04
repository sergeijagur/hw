package telia.hw.service.horse;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class WinnerHorsesRequest implements Serializable {
    private ArrayList winnerHorses;

}
