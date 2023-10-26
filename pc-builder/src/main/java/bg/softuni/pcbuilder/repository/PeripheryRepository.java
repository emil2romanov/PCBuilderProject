package bg.softuni.pcbuilder.repository;

import bg.softuni.pcbuilder.model.entity.PeripheryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeripheryRepository extends JpaRepository<PeripheryEntity, Long> {
}
