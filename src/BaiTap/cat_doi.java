package BaiTap;

import java.util.Scanner;

public class cat_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            String res = "";
            for(int i=0;i<s.length();i++){
                char x = s.charAt(i);

                if(x == '0' || x == '8' || x == '9') res += "0";
                else if(x == '1') res += "1";
                else{
                    res = "INVALID";
                    break;
                }
            }

            int st;
            for(st = 0; st < res.length(); st++){
                if(res.charAt(st) != '0') break;
            }
            if(st == res.length() && res.charAt(res.length()-1) == '0'){
                System.out.println("INVALID");
            }
            else System.out.println(res.substring(st,res.length()));
        }
    }
}
