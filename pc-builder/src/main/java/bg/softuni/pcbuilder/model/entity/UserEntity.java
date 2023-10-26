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
}