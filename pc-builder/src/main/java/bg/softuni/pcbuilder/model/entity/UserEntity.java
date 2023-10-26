package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String username;
    private String password;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<UserRoleEntity> roles;

    @OneToMany(mappedBy = "user")
    private List<ComponentEntity> components;

    @OneToMany(mappedBy = "user")
    private List<PeripheryEntity> periphery;

    @OneToMany(mappedBy = "user")
    private List<ComputerEntity> computers;

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(List<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public List<ComponentEntity> getComponents() {
        return components;
    }

    public UserEntity setComponents(List<ComponentEntity> components) {
        this.components = components;
        return this;
    }

    public List<PeripheryEntity> getPeriphery() {
        return periphery;
    }

    public UserEntity setPeriphery(List<PeripheryEntity> periphery) {
        this.periphery = periphery;
        return this;
    }

    public List<ComputerEntity> getComputers() {
        return computers;
    }

    public UserEntity setComputers(List<ComputerEntity> computers) {
        this.computers = computers;
        return this;
    }


}