package J01005;

import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();

            for(int i=0;i<n-1;i++){
                System.out.printf("%.6f ", h * Math.sqrt((double) (i + 1) / n));
            }
            System.out.println();
        }
    }
}
