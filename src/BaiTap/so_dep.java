package BaiTap;

import java.util.Scanner;

public class so_dep {
    public static boolean thuanNghich(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static boolean isChan(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) % 2 != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s =  sc.nextLine();
            System.out.println(isChan(s) && thuanNghich(s) ? "YES" : "NO");
        }
    }
}
