package J07012_bianaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P {

    @SuppressWarnings("unchecked")
    public static ArrayList<String> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    //Ghi file nhị phân
//    public static void writeList(String fileName, ArrayList<String> list){
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            oos.writeObject(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("John Doe");
//        list1.add("Jane Smith");
//        list1.add("Bob Johnson");
//        writeList("DATA.in", list1);
        ArrayList<String> list = readList("DATA.in");
        Map<String, Integer> map = new HashMap<>();

        for(String s : list){
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
            Matcher matcher = pattern.matcher(s);

            while(matcher.find()){
                String word = matcher.group().toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }
}
