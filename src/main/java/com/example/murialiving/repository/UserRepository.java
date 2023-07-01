import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, String>{
    @NonNull
    Optional<List<Schedule>> getAllUsers(@NonNull Integer id);
    @NonNull
    Optional<User> getUserByUsername(@NonNull String username);
}
