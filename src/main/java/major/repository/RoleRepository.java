package major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import major.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
