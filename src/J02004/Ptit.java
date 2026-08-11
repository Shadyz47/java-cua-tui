package J02004;

import java.util.Arrays;
import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            boolean isTrue = true;
            for(int i=0;i<n/2;i++){
                if(a[i] != a[n-1-i]){
                    isTrue = false;
                    break;
                }
            }
            System.out.println(isTrue ? "YES" : "NO");
        }
    }
}
