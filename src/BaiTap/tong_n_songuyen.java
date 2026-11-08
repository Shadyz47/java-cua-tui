package BaiTap;

import java.util.Scanner;

public class tong_n_songuyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            long sum = ((long) n *(n+1))/2;
            System.out.println(sum);
        }
    }
}
