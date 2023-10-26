package bg.softuni.pcbuilder.repository;

import bg.softuni.pcbuilder.model.entity.UserRoleEntity;
import bg.softuni.pcbuilder.model.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

    Optional<UserRoleEntity> findUserRoleEntityByRole(UserRoleEnum role);
}
