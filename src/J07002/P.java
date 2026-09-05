package J07002;

import java.io.File;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        long sum = 0;
        try (Scanner sc = new Scanner(new File("DATA.in"))) {
            while(sc.hasNext()){
                String data = sc.next();
                try{
                    sum += Integer.parseInt(data);
                }
                catch (NumberFormatException e){
                    continue;
                }
            }
            System.out.println(sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
