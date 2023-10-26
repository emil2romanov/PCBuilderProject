package bg.softuni.pcbuilder.model.entity;

import bg.softuni.pcbuilder.model.enums.BrandEnum;
import jakarta.persistence.*;

@MappedSuperclass
public class ProductEntity extends BaseEntity{

    private String name;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private BrandEnum brand;


    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ProductEntity setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public ProductEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public BrandEnum getBrand() {
        return brand;
    }

    public ProductEntity setBrand(BrandEnum brand) {
        this.brand = brand;
        return this;
    }
}
