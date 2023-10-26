package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.*;

@MappedSuperclass
public class ProductEntity extends BaseEntity{

    private String name;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Enumerated(EnumType.STRING)
    private BrandEnum brand;
}
