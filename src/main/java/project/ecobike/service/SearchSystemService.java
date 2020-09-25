package project.ecobike.service;

import project.ecobike.service.impl.searchservice.SearchCommand;

public interface SearchSystemService {
    SearchCommand getCommand(int command);

}
