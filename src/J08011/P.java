package J08011;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P {
    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();

        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                map.put(s,map.getOrDefault(s,0) + 1);
            }
        }

        sc.close();

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
