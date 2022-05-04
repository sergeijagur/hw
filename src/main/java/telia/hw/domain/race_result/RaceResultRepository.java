package telia.hw.domain.race_result;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RaceResultRepository extends JpaRepository<RaceResult, Integer> {
    Optional<RaceResult> findByRaceId(Integer id);




}