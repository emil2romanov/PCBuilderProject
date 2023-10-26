package bg.softuni.pcbuilder.model.entity;

import bg.softuni.pcbuilder.model.enums.PeripheryTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "peripherals")
public class PeripheryEntity extends ProductEntity {

    @Enumerated(EnumType.STRING)
    private PeripheryTypeEnum type;

    public PeripheryTypeEnum getType() {
        return type;
    }

    public PeripheryEntity setType(PeripheryTypeEnum type) {
        this.type = type;
        return this;
    }
}
