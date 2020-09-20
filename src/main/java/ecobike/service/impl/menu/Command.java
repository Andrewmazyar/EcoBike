package ecobike.service.impl.menu;

import ecobike.model.AbstractBike;

import java.io.IOException;
import java.util.List;

public interface Command {
    List<AbstractBike> execute(List<AbstractBike> list, String pathToFile) throws IOException;
}
