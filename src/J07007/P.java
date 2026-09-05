package J07007;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P {
    public static void main(String[] args) {
        File file = new File("VANBAN.in");
        Set<String> set = new TreeSet<>();
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()){
                set.add(sc.next().toLowerCase());
            }

            set.forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
