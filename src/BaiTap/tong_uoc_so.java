package BaiTap;

import java.util.Scanner;

public class tong_uoc_so {
    static final int MAX = 2_000_000;
    static int[] nt = new int[MAX+1];

    static void sang(){
        for(int i=2;i<=MAX-1;i++){
            nt[i] = i;
        }
        for(int i =2;i<=Math.sqrt(MAX);i++){
            if(nt[i] == i){
                for(int j=i*i;j<=MAX;j+=i){
                    if(nt[j]==j){
                        nt[j] = i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        sang();
        long sum = 0;
        while(t-->0){
            int n = sc.nextInt();
            while(n>1){
                sum += nt[n];
                n /= nt[n];
            }
        }
        System.out.print(sum);
    }
}
