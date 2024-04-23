package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_ELEMENTS = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            bulldozersList.add(new Bulldozer());
        }
        return bulldozersList;
    }
}
