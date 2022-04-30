package telia.hw.domain.race_result;

import lombok.Getter;
import lombok.Setter;
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

    @Column(name = "winner_horse_id", nullable = false)
    private Integer winnerHorseId;

    @Column(name = "second_place_horse_id", nullable = false)
    private Integer secondPlaceHorseId;

    @Column(name = "third_place_horse_id", nullable = false)
    private Integer thirdPlaceHorseId;

}