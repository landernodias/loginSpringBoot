package projeto.loginSpringBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import projeto.loginSpringBoot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
