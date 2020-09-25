package project.ecobike.service.impl.searchservice;

import java.util.function.Predicate;
import org.springframework.stereotype.Component;
import project.ecobike.model.AbstractBike;

@Component
public class SearchByType implements SearchCommand {
    @Override
    public Predicate<AbstractBike> search(String parameter) {
        return b -> b.getType().equalsIgnoreCase(parameter);
    }
}
