package ecobike.service.impl.search;

import ecobike.model.AbstractBike;
import java.util.function.Predicate;

public interface SearchCommand {
    Predicate<AbstractBike> search(String parameter);
}
