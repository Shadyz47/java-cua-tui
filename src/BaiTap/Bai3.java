package BaiTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("numbers.dat"));
            double sum = 0.0;
            while (input.hasNext()) {
                if (input.hasNextDouble()) {
                    double next = input.nextDouble();
                    System.out.println("number = " + next);
                    sum += next;
                }
                else {
                    input.next();
                }
            }
            System.out.println("Sum = " + sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
