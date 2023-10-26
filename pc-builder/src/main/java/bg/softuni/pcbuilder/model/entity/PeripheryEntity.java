package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "peripherals")
public class PeripheryEntity extends ProductEntity {

    @Enumerated(EnumType.STRING)
    private PeripheryTypeEnum type;
}
