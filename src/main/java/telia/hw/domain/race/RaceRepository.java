package telia.hw.domain.race;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface RaceRepository extends JpaRepository<Race, Integer> {
    Race findByNameAndDate(String name, LocalDate date);

}