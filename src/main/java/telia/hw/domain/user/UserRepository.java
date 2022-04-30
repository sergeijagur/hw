package telia.hw.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where upper(u.username) = upper(?1)")
    Optional<User> existUsername(String username);

    @Query("select u from User u where upper(u.username) = upper(?1) and u.password = ?2")
    Optional<User> logInControl(String username, String password);






}