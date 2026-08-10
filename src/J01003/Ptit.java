package J01003;

import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        if (x == 0 && y == 0){
            System.out.println("VSN");
        }
        else if(x==0 && y != 0){
            System.out.println("VN");
        }
        else{
            System.out.printf("%.2f", (double)(-y) / x);
        }
    }
}
