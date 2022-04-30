package telia.hw.domain.horse;

import lombok.Getter;
import lombok.Setter;
import telia.hw.domain.race.Race;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "horse")
public class Horse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

}