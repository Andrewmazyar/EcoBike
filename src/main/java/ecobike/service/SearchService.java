package ecobike.service;

import ecobike.service.impl.search.SearchCommand;

public interface SearchService {
    SearchCommand getCommand(int command);

}
