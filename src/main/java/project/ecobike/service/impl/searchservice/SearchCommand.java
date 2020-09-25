package project.ecobike.service.impl.searchservice;

import java.util.function.Predicate;
import project.ecobike.model.AbstractBike;

public interface SearchCommand {
    Predicate<AbstractBike> search(String parameter);
}
