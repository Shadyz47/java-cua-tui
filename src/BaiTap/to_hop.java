package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class to_hop {
    static int n,k;
    static int[] x = new  int[10005];
    static List<List<Integer>> list = new ArrayList<>();

    public static void ql(int i){
        for(int j = x[i-1] + 1; j<= n-k+i;j++){
            x[i] = j;
            if(i == k){
                List<Integer> tmp = new ArrayList<>();
                for(int u = 1;u<=i;u++){
                    System.out.print(x[u] + " ");
                    tmp.add(x[u]);
                }
                list.add(tmp);
                System.out.println();
            }
            else ql(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =  sc.nextInt();
        k = sc.nextInt();
        ql(1);
        System.out.println("Tong cong co " + list.size() + " to hop");
    }
}
