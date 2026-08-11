package J01007;

import java.util.Arrays;
import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long[] fibo = new long[1005];
            fibo[1] = 1;
            fibo[2] = 1;
            for(int i=3;i<=92;i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }

            long n = sc.nextLong();
            boolean isFibo = false;
            for(int i=0;i<=92;i++){
                if(fibo[i] == n){
                    isFibo = true;
                    break;
                }
            }
            if(isFibo){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
