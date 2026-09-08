package J07015;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

public class P {
    public static boolean isPrime(int n){
        for(int i=2;i<=sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static ArrayList<Integer> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<Integer>) ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = readList("SONGUYEN.in");
        Map<Integer, Integer> map = new HashMap<>();

        list.stream()
                .filter(P::isPrime)
                .forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));

        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
