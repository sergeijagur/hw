package telia.hw.domain.race_result;

import lombok.Getter;
import lombok.Setter;
import telia.hw.domain.horse.Horse;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.horse.HorseRaceResultResponse;
import telia.hw.domain.race.Race;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "race_result")
public class RaceResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "race_id", nullable = false)
    private Race race;

    @Column(name = "winner")
    private HorseRaceResultResponse winner;

    @Column(name = "second_place")
    private HorseRaceResultResponse secondPlace;

    @Column(name = "third_place")
    private HorseRaceResultResponse thirdPlace;


}