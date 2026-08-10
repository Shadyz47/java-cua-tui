package J01002;

import java.util.Scanner;

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Long n = sc.nextLong();
            System.out.println((n * (n + 1) / 2));
        }
    }
}
