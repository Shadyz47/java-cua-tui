package BaiTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("numbers.dat"));
            double sum = 0.0;
            while (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println("number = " + next);
                sum += next;
            }
            System.out.println("Sum = " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
