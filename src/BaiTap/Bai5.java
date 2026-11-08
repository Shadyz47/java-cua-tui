package BaiTap;

import java.io.File;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("Hello.txt"))) {
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                String[] tmp = data.trim().split("\\s+");

                double sum = 0;
                for (int i = 2; i < tmp.length; i++) {
                    sum += Double.parseDouble(tmp[i]);
                }

                double tb = sum / (tmp.length - 2);
                System.out.printf("%s (ID#%s) worked %.1f hours (%.2f hours/day)",
                        tmp[1], tmp[0], sum, tb);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
