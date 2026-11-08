package BaiTap;

import java.util.Scanner;

public class lcm_gcd {
    public static int gcd(int a,int b){
        while(b!=0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static long lcm(int a,int b){
        return (long)a/gcd(a,b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a,b) + " " + gcd(a,b));
        }
    }
}
