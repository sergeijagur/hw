package telia.hw.domain.horse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface HorseRepository extends JpaRepository<Horse, Integer> {
    @Query("select h from Horse h where upper(h.name) = upper(?1)")
    Optional<Horse> existsByName(String name);

    @Query("select h from Horse h where h.user.id = ?1")
    List<Horse> findByUserId(Integer id);






}