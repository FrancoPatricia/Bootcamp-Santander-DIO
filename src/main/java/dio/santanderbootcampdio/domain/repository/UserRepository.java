package dio.santanderbootcampdio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.santanderbootcampdio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
