package J07023;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P {
    private static List<Integer> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Integer>) ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static boolean[] b = new boolean[10000];

    private static void prime(){
       for(int i=0;i<10000;i++) b[i] = true;
       b[0] = b[1] = false;
       for(int i=2;i*i<10000;i++){
           if(b[i]){
               for(int j=i*i;j<10000;j+=i){
                   b[j] = false;
               }
           }
       }
    }

    private static boolean isPalindrome(int s){
        String s1 = Integer.toString(s);
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list1 = readList("DATA1.in");
        List<Integer> list2 = readList("DATA2.in");

        int[] dem1 = new int[10000];
        int[] dem2 = new int[10000];
        prime();

        for(Integer n : list1){
            if(isPalindrome(n)){
                dem1[n]++;
            }
        }

        for(Integer n : list2){
            if(isPalindrome(n)){
                dem2[n]++;
            }
        }

        for(int i=0;i<1000000;i++){
            if(dem1[i] > 0 && dem2[i] > 0){
                System.out.println(i + " " + dem1[i] + " " + dem2[i]);
            }
        }
    }
}
