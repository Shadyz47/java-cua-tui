package BaiTap;

import java.util.Scanner;

public class kiem_tra_fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[1005];
        a[1] = 1;
        a[2] = 1;
        for(int i=3;i<=92;i++){
            a[i] = a[i-1] +  a[i-2];
        }

        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            boolean flag = false;
            for(int i=0;i<=92;i++){
                if(n == a[i]){
                    flag = true;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
