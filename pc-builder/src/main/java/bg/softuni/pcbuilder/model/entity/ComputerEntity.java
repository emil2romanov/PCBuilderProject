package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "computers")
public class ComputerEntity extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name = "cpu_id")
    private ComponentEntity cpu;

    @ManyToOne
    @JoinColumn(name = "gpu_id")
    private ComponentEntity gpu;

    @ManyToOne
    @JoinColumn(name = "ram_id")
    private ComponentEntity ram;

    @ManyToOne
    @JoinColumn(name = "motherboard_id")
    private ComponentEntity motherboard;

    @ManyToOne
    @JoinColumn(name = "ssd_id")
    private ComponentEntity ssd;

    @ManyToOne
    @JoinColumn(name = "monitor_id")
    private PeripheryEntity monitor;

    @ManyToOne
    @JoinColumn(name = "keyboard_id")
    private PeripheryEntity keyboard;

    @ManyToOne
    @JoinColumn(name = "mouse_id")
    private PeripheryEntity mouse;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
