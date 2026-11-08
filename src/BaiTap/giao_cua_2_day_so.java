package BaiTap;

import java.util.*;

public class giao_cua_2_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            int x =  sc.nextInt();
            a.add(x);
        }
        for(int i=0;i<m;i++){
            int  x =  sc.nextInt();
            b.add(x);
        }

        for(Integer x : a){
            if(b.contains(x)){
                set.add(x);
            }
        }

        for(Integer x : set){
            System.out.print(x+" ");
        }
    }
}
