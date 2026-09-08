package J07011_regex;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P {

    public static void main(String[] args) {
        File file = new File("VANBAN.in");

        try (Scanner sc = new Scanner(file)) {
            String n = sc.next();
            Map<String, Integer> list = new HashMap<>();
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
                Matcher matcher = pattern.matcher(data);

                while(matcher.find()){
                    String word = matcher.group().toLowerCase();
                    list.put(word, list.getOrDefault(word, 0) + 1);
                }
            }

            list.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
