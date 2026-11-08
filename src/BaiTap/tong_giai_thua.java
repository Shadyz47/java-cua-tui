package BaiTap;

import java.util.Scanner;

public class tong_giai_thua {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long tmp = 1;
        long res = 0;
        for(int i=1;i<=n;i++){
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }
}
