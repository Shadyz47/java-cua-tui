package J01001;

import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();

        if (chieuDai <= 0 || chieuRong <= 0){
            System.out.println("0");
        }
        else{
            System.out.printf("%d %d", 2*(chieuDai+chieuRong), chieuDai*chieuRong);
        }
    }
}
