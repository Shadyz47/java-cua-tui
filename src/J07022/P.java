package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class P {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        List<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {

            while(sc.hasNextLine()){
                String data = sc.next();
                try {
                    int n = Integer.parseInt(data);
                } catch (Exception e) {
                    list.add(data);
                }
            }

            list.sort(String::compareTo);
            list.forEach(x -> System.out.print(x + " "));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
