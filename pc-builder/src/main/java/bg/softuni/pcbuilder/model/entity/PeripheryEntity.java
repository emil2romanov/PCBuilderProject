package bg.softuni.pcbuilder.model.entity;

import bg.softuni.pcbuilder.model.enums.ComponentTypeEnum;
import bg.softuni.pcbuilder.model.enums.PeripheryTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "peripherals")
public class PeripheryEntity extends ProductEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PeripheryTypeEnum type;

    @Column(nullable = false)
    private String description;

    private void setDescription(PeripheryTypeEnum type) {
        String description = "";
        switch (type) {
            case MONITOR -> description = "A monitor is a display device that showcases visual information from a computer, allowing users to interact with digital content.";
            case KEYBOARD -> description = "A keyboard is an input device with keys that enable users to enter text, commands, and other data into a computer or other devices.";
            case MOUSE -> description = "A mouse is a pointing device that enables users to control the on-screen cursor, making it an essential tool for navigating and interacting with graphical user interfaces.";
        }
        this.description = description;
    }

    public PeripheryTypeEnum getType() {
        return type;
    }

    public PeripheryEntity setType(PeripheryTypeEnum type) {
        this.type = type;
        setDescription(type);
        return this;
    }
}
