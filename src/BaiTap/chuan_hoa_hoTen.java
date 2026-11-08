package BaiTap;

import java.util.Locale;
import java.util.Scanner;

public class chuan_hoa_hoTen {
    public static String chuanHoa(String name){
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<tmp.length-1;i++){
            sb.append(Character.toUpperCase(tmp[i].charAt(0))).append(tmp[i].substring(1)).append(" ");
        }
        sb.append(Character.toUpperCase(tmp[tmp.length-1].charAt(0))).append(tmp[tmp.length-1].substring(1));
        sb.append(", ");
        sb.append(tmp[0].toUpperCase());
        return sb.toString().trim();
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s =  sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
