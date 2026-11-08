package BaiTap;

import java.util.Scanner;

public class hcn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m<=0 || n <= 0){
            System.out.println(0);
        }else
            System.out.printf("%d %d", 2*(m+n), m*n);
    }
}
