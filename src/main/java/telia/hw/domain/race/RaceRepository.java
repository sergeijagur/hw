package telia.hw.domain.race;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Optional;

public interface RaceRepository extends JpaRepository<Race, Integer> {
    Race findByNameAndDate(String name, LocalDate date);

    @Query("select r from Race r where upper(r.name) = upper(?1) and upper(r.place) = upper(?2) and r.date = ?3")
    Optional<Race> raceExist (String name, String place, LocalDate date);


}