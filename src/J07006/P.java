package J07006;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P {

    private static ArrayList<Integer> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<Integer>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = readList("DATA.in");
        Map<Integer, Integer> map = new HashMap<>();

        list.forEach(x -> map.put(x, map.getOrDefault(x,0) + 1));

        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
