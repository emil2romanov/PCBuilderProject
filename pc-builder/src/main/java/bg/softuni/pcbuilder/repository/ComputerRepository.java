package bg.softuni.pcbuilder.repository;

import bg.softuni.pcbuilder.model.entity.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerEntity, Long> {
}
