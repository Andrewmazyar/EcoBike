package ecobike.service.impl.search;

import ecobike.model.AbstractBike;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

@Component
public class SearchByBrand implements SearchCommand {
    @Override
    public Predicate<AbstractBike> search(String parameter) {
        return b -> b.getBrand().equalsIgnoreCase(parameter);
    }
}
