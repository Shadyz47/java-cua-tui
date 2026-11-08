package TestDinhKi;

import java.math.BigInteger;
import java.util.Scanner;

public class acc {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c =  sc.nextBigInteger();

            if(a.remainder(c).equals(BigInteger.ZERO) && b.remainder(c).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
