package J01004;

import java.util.Scanner;

public class Ptit {
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return n>2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "YES" : "NO");
        }
    }
}
