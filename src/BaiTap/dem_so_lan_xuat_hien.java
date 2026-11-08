package BaiTap;

import java.util.*;

public class dem_so_lan_xuat_hien {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return  false;
        }
        return n>=1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            Map<Integer,Integer> map = new LinkedHashMap<>();
            for(int j=0;j<n;j++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x,0)+1);
            }

            System.out.println("Test " + i + ":");
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
