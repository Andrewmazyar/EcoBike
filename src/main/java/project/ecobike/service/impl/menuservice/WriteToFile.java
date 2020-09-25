package project.ecobike.service.impl.menuservice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import project.ecobike.dao.impl.BikeDaoImpl;
import project.ecobike.model.AbstractBike;

@Component
public class WriteToFile implements CommandServices {
    @Override
    public List<AbstractBike> execute(List<AbstractBike> list, String pathToFile)
            throws IOException {
        if (list.isEmpty()) {
            System.out.println("You dont add anything, add something to save in file");
            return list;
        }
        System.out.println("Please enter path for your folder in next format, for example");
        System.out.println("C: Folder Catalog");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String pathCheck;

        while (true) {
            pathCheck = String.join(File.separator, path.split(" +"));
            File tmpFile = new File(pathCheck);
            if (tmpFile.exists()) {
                break;
            } else {
                System.out.println("Entered folder is incorrect, please check it and try again");
                path = scanner.nextLine();
            }
        }

        System.out.println("Please enter file name in the next format:");
        System.out.println("product.txt");
        String fileName = scanner.nextLine();
        while (!(fileName.isEmpty() || fileName.endsWith(".txt"))) {
            System.out.println("Entered file name is incorrect, please check it and try again");
            fileName = scanner.nextLine();
        }

        String fullPath = pathCheck + File.separator + fileName;
        BikeDaoImpl bikeDao = new BikeDaoImpl();
        bikeDao.addAll(fullPath, list);
        System.out.println("Your file successfully saved!");
        list.clear();
        return list;
    }
}
