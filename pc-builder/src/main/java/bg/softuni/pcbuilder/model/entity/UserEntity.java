package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Length(min = 3, max = 20)
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    @Email
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