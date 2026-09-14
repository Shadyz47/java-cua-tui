package BaiTap;

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
    }
}

public class P {
    public static void main(String[] args) {
        String x = "Ha noi mat nhu 66 Hang Be 123";


    }
}
