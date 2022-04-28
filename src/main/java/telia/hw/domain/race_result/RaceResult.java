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

/*
  TODO [JPA Buddy] create field to map the 'winner' column
   Available actions: Define target Java type | Uncomment as is | Remove column mapping
  @Column(name = "winner", columnDefinition = "json not null")
  private Object winner;
*/
/*
  TODO [JPA Buddy] create field to map the 'second_place' column
   Available actions: Define target Java type | Uncomment as is | Remove column mapping
  @Column(name = "second_place", columnDefinition = "json not null")
  private Object secondPlace;
*/
/*
  TODO [JPA Buddy] create field to map the 'third_place' column
   Available actions: Define target Java type | Uncomment as is | Remove column mapping
  @Column(name = "third_place", columnDefinition = "json not null")
  private Object thirdPlace;
*/
}