package project.ecobike.dao;

import java.io.IOException;
import java.util.List;
import project.ecobike.model.AbstractBike;

public interface BikeDao {

    List<String> addAll(String path, List<AbstractBike> unsavedProducts) throws IOException;

    List<AbstractBike> getAll(String path, List<AbstractBike> catalog) throws IOException;
}
