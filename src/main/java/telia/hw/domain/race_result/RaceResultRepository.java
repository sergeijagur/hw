package telia.hw.domain.race_result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RaceResultRepository extends JpaRepository<RaceResult, Integer> {
    Optional<RaceResult> findByRaceId(Integer id);

    @Query("select r from RaceResult r where r.race.user.id = ?1")
    List<RaceResult> findByRaceUserId(Integer id);

    @Query("select r from RaceResult r where r.race.user.id = ?1")
    Optional<RaceResult> findByUserId(Integer id);






}