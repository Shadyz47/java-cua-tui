package BaiTap;

import java.util.Scanner;

public class boi_so_nho_nhat_cua_n_so {
    public static  long gcd(long a,long b){
        while(b!=0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static long lcm(long a, long b){
        return a*b / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long res = 1;
            for(int i=1;i<=n;i++){
                res = lcm(res,i);
            }

            System.out.println(res);
        }
    }
}
