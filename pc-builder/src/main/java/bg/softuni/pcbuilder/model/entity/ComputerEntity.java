package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "computers")
public class ComputerEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "computer_components",
            joinColumns = @JoinColumn(name = "computer_id"),
            inverseJoinColumns = @JoinColumn(name = "component_id")
    )
    private List<ComponentEntity> components;

    @ManyToMany
    @JoinTable(
            name = "computer_peripherals",
            joinColumns = @JoinColumn(name = "computer_id"),
            inverseJoinColumns = @JoinColumn(name = "peripheral_id")
    )
    private List<PeripheryEntity> peripherals;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public String getName() {
        return name;
    }

    public ComputerEntity setName(String name) {
        this.name = name;
        return this;
    }

    public List<ComponentEntity> getComponents() {
        return components;
    }

    public ComputerEntity setComponents(List<ComponentEntity> components) {
        this.components = components;
        return this;
    }

    public List<PeripheryEntity> getPeripherals() {
        return peripherals;
    }

    public ComputerEntity setPeripherals(List<PeripheryEntity> peripherals) {
        this.peripherals = peripherals;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public ComputerEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
