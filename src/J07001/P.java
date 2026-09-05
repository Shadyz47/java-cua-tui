package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Path path = Path.of("DATA.in");

        try(Scanner sc = new Scanner(path.toFile())) {
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
