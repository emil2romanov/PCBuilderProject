package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "components")
public class ComponentEntity extends ProductEntity {

    @Enumerated(EnumType.STRING)
    private ComponentTypeEnum type;
}
