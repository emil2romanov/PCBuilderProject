package bg.softuni.pcbuilder.model.entity;

import bg.softuni.pcbuilder.model.enums.ComponentTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "components")
public class ComponentEntity extends ProductEntity {

    @Enumerated(EnumType.STRING)
    private ComponentTypeEnum type;

    public ComponentTypeEnum getType() {
        return type;
    }

    public ComponentEntity setType(ComponentTypeEnum type) {
        this.type = type;
        return this;
    }
}
