package BaiTap;

import java.util.Scanner;

public class thua_so_nguyen_to {
    private static void nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            int cnt = 0;
            while(n%i==0){
                cnt++;
                n/=i;
            }
            if(cnt > 0) System.out.print(i + "(" + cnt + ") ");
        }

        if(n>1) System.out.print(n + "(1)");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++){
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            nt(n);

        }
    }
}
