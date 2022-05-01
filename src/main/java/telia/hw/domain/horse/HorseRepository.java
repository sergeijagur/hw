package telia.hw.domain.horse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface HorseRepository extends JpaRepository<Horse, Integer> {
    @Query("select h from Horse h where upper(h.name) = upper(?1)")
    Optional<Horse> existsByName(String name);


}