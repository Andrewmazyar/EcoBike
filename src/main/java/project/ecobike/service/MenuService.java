package project.ecobike.service;

import project.ecobike.service.impl.menuservice.CommandServices;

public interface MenuService {

    CommandServices getCommand(int command);
}
