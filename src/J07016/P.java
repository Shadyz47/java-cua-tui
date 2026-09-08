package J07016;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

public class P {
    public static ArrayList<Integer> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<Integer>) ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = readList("DATA1.in");
        ArrayList<Integer> list2 = readList("DATA2.in");
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        list.stream()
                .filter(P::isPrime)
                .forEach(n -> map1.put(n, map1.getOrDefault(n, 0) + 1));
        list2.stream()
                .filter(P::isPrime)
                .forEach(n -> map2.put(n, map2.getOrDefault(n, 0) + 1));

        map1.entrySet().stream()
                .filter(e -> map2.containsKey(e.getKey()))
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue() + " " + map2.get(e.getKey())));

    }
}
