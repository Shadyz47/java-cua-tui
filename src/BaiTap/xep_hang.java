package BaiTap;


import java.util.*;

public class xep_hang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =  sc.nextInt();
        List<int[]> list = new ArrayList<>();
        while(t-->0){
            int a =sc.nextInt();
            int b=sc.nextInt();
            list.add(new int[]{a, b});
        }

        list.sort(Comparator.comparingInt(x -> x[0]));

        int res = 0;

        for (int[] x : list) {
            res = Math.max(res, x[0]);
            res += x[1];
        }
        System.out.println(res);
    }
}
