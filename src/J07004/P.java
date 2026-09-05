package J07004;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P {
    public static void main(String[] args) {

        File file = new File("DATA.in");
        int[] arr = new int[100000];

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                arr[sc.nextInt()]++;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0) {
                    System.out.println(i + " " + arr[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
