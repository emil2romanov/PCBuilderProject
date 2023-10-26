package bg.softuni.pcbuilder.init;

import bg.softuni.pcbuilder.model.entity.ComponentEntity;
import bg.softuni.pcbuilder.model.entity.PeripheryEntity;
import bg.softuni.pcbuilder.model.enums.ComponentTypeEnum;
import bg.softuni.pcbuilder.model.enums.PeripheryTypeEnum;
import bg.softuni.pcbuilder.repository.ComponentRepository;
import bg.softuni.pcbuilder.repository.PeripheryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DBInit implements CommandLineRunner {

    private final ComponentRepository componentRepository;
    private final PeripheryRepository peripheryRepository;

    public DBInit(ComponentRepository componentRepository, PeripheryRepository peripheryRepository) {
        this.componentRepository = componentRepository;
        this.peripheryRepository = peripheryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        boolean hasComponents = componentRepository.count() > 0;
        boolean hasPeriphery = peripheryRepository.count() > 0;

        if (!hasComponents) {
            List<ComponentEntity> components = new ArrayList<>();

            Arrays.stream(ComponentTypeEnum.values())
                    .forEach(componentType -> {
                        ComponentEntity component = new ComponentEntity();
                        component.setType(componentType);
                        components.add(component);
                    });

            componentRepository.saveAll(components);
        }

        if (!hasPeriphery) {
            List<PeripheryEntity> peripherals = new ArrayList<>();

            Arrays.stream(PeripheryTypeEnum.values())
                    .forEach(peripheryType -> {
                        PeripheryEntity periphery = new PeripheryEntity();
                        periphery.setType(peripheryType);
                        peripherals.add(periphery);
                    });

            peripheryRepository.saveAll(peripherals);
        }
    }
}
