package bg.softuni.pcbuilder.model.entity;

import bg.softuni.pcbuilder.model.enums.ComponentTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "components")
public class ComponentEntity extends ProductEntity {

    @Enumerated(EnumType.STRING)
    private ComponentTypeEnum type;

    @Column(nullable = false)
    private String description;

    private void setDescription(ComponentTypeEnum type) {
        String description = "";
        switch (type) {
            case CPU -> description = "CPU (Central Processing Unit) serves as the brain of a computer, executing instructions from software and driving overall performance, with leading manufacturers like Intel and AMD shaping the landscape of modern computing.";
            case GPU -> description = "GPU (Graphics Processing Unit) specializes in rendering graphics and images, vital for gaming and multimedia tasks, with NVIDIA and AMD being prominent players in the competitive graphics card market.";
            case RAM -> description = "RAM (Random Access Memory) acts as the computer's short-term memory, providing fast data access for running applications, and is essential for multitasking, with renowned brands like Corsair and Kingston offering various RAM options.";
            case MOTHERBOARD -> description = "MOTHERBOARD is the main circuit board connecting all hardware components, serving as the foundation for the computer, with ASUS, MSI, and Gigabyte being prominent motherboard manufacturers, known for their reliability and features.";
            case SSD -> description = "SSD (Solid State Drive) offers rapid data storage and retrieval, replacing traditional hard drives with faster and more durable technology, and is provided by companies like Samsung and Crucial, enhancing system speed and responsiveness.";
        }
        this.description = description;
    }

    public ComponentTypeEnum getType() {
        return type;
    }

    public ComponentEntity setType(ComponentTypeEnum type) {
        this.type = type;
        setDescription(type);
        return this;
    }
}
