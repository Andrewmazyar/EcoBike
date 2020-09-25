package project.ecobike.service.impl.menuservice;

import java.io.IOException;
import java.util.List;
import project.ecobike.model.AbstractBike;

public interface CommandServices {
    List<AbstractBike> execute(List<AbstractBike> list, String pathToFile) throws IOException;
}
