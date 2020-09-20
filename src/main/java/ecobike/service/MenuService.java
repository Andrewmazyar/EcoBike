package ecobike.service;

import ecobike.service.impl.menu.Command;

public interface MenuService {

    Command getCommand(int command);
}
