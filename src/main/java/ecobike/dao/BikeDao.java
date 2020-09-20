package ecobike.dao;

import ecobike.model.AbstractBike;

import java.io.IOException;
import java.util.List;

public interface BikeDao {

    List<String> addAll(String path, List<AbstractBike> unsavedProducts) throws IOException;

    List<AbstractBike> getAll(String path, List<AbstractBike> catalog) throws IOException;
}
