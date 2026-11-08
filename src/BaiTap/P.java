package BaiTap;

import java.util.Locale;
import java.util.Scanner;

class DaySo{
    private int[] a;

    public DaySo(int[] a) {
        this.a = a;
    }

    public DaySo(int n){
        a = new int[n];
    }

    public void input(Scanner sc){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public void output(){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public DaySo nt(){
        int[] t;
        int k = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == 0){
                k++;
            }
        }
        return null;
    }
}

class KiemTra{
     public boolean isMa(String ma){
         String regex = "^B\\d{2}DC(CN|AT)\\d{3}$";
         return ma.toUpperCase().matches(regex);
     }

     public boolean isPhone(String phone){
         String regex = "^\\(?\\d{3}\\)-?\\s*\\d{3}\\s*-?\\d{4}$";
         return phone.toUpperCase().matches(regex);
     }
}

public class P {
    public static void main(String[] args) {
        String x = "Ha noi mat nhu 66 Hang Be";
        String y = "Ha noi mat nhu 66 Hang Be qua";

        KiemTra kt =  new KiemTra();
        String test = "B24DCVN108";
        String test2 = "b24dccn123";

        System.out.println(kt.isMa(test));
        System.out.println(kt.isMa(test2));

        System.out.println(x.compareTo(y));
    }
}
