package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            MachineProducer producer = new BulldozerProducer();
            machines = producer.get();
        } else if (type == Excavator.class) {
            MachineProducer producer = new ExcavatorProducer();
            machines = producer.get();
        } else if (type == Truck.class) {
            MachineProducer producer = new TruckProducer();
            machines = producer.get();
        } else {
            machines = Collections.emptyList();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
