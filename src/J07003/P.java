package J07003;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file)) {
            StringBuffer data = new StringBuffer(sc.next());

            while(data.length() != 1){
                String s1 = data.substring(0, (int)data.length()/2);
                String s2 = data.substring((int)data.length()/2);

                BigInteger bi1 = new BigInteger(s1);
                BigInteger bi2 = new BigInteger(s2);

                data = new StringBuffer(bi1.add(bi2).toString());
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
