package bg.softuni.pcbuilder.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "computers")
public class ComputerEntity extends BaseEntity{

    @Column(nullable = false)
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

    public String getName() {
        return name;
    }

    public ComputerEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ComponentEntity getCpu() {
        return cpu;
    }

    public ComputerEntity setCpu(ComponentEntity cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComponentEntity getGpu() {
        return gpu;
    }

    public ComputerEntity setGpu(ComponentEntity gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComponentEntity getRam() {
        return ram;
    }

    public ComputerEntity setRam(ComponentEntity ram) {
        this.ram = ram;
        return this;
    }

    public ComponentEntity getMotherboard() {
        return motherboard;
    }

    public ComputerEntity setMotherboard(ComponentEntity motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComponentEntity getSsd() {
        return ssd;
    }

    public ComputerEntity setSsd(ComponentEntity ssd) {
        this.ssd = ssd;
        return this;
    }

    public PeripheryEntity getMonitor() {
        return monitor;
    }

    public ComputerEntity setMonitor(PeripheryEntity monitor) {
        this.monitor = monitor;
        return this;
    }

    public PeripheryEntity getKeyboard() {
        return keyboard;
    }

    public ComputerEntity setKeyboard(PeripheryEntity keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public PeripheryEntity getMouse() {
        return mouse;
    }

    public ComputerEntity setMouse(PeripheryEntity mouse) {
        this.mouse = mouse;
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
