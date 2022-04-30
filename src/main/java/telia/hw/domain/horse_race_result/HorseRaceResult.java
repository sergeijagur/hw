package telia.hw.domain.horse_race_result;

import lombok.Getter;
import lombok.Setter;
import telia.hw.domain.horse.Horse;
import telia.hw.domain.race_result.RaceResult;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "horse_race_result")
public class HorseRaceResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "race_result_id", nullable = false)
    private RaceResult raceResult;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "horse_id", nullable = false)
    private Horse horse;

}