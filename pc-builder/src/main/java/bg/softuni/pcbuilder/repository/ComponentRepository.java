package bg.softuni.pcbuilder.repository;

import bg.softuni.pcbuilder.model.entity.ComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentEntity, Long> {
}
