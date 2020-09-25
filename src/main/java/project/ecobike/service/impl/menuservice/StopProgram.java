package project.ecobike.service.impl.menuservice;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import project.ecobike.model.AbstractBike;

@Component
public class StopProgram implements CommandServices {
    @Override
    public List<AbstractBike> execute(List<AbstractBike> list, String pathToFile)
            throws IOException {
        if (!list.isEmpty()) {
            System.out.println("You have unsaved changes, do you want to save them?");
            System.out.println("Type y/n (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            while (!(choice.equalsIgnoreCase("yes")
                    || choice.equalsIgnoreCase("no")
                    || choice.equalsIgnoreCase("y")
                    || choice.equalsIgnoreCase("n"))) {
                System.out.println("You made a mistake, try again");
                System.out.println("Type y/n (yes/no)");
                choice = scanner.nextLine();
            }
            if (choice.equalsIgnoreCase("yes")
                    || choice.equalsIgnoreCase("y")) {
                WriteToFile writeToFile = new WriteToFile();
                writeToFile.execute(list, pathToFile);
            } else {
                scanner.close();
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
        return list;
    }
}
