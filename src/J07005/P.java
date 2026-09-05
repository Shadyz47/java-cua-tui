package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class P {
    public static void main(String[] args) {

        int[] arr = new int[1005];
        try (DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"))) {
            for(int i = 0;i<100000;i++){
                arr[dis.readInt()]++;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0) {
                    System.out.println(i + " " + arr[i]);
                }
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
