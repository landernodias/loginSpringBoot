package projeto.loginSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.loginSpringBoot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
