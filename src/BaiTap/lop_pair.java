package BaiTap;

import java.util.Scanner;

class Pair<T extends Number, U extends Number>{
    private final T first;
    private final U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    private boolean isPrime(long n){
        if(n < 2) return false;
        for(long i = 2; i <= n / i; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        return isPrime(first.longValue()) && isPrime(second.longValue());
    }

    @Override
    public String toString(){
        return first + " " + second;
    }
}

public class lop_pair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i=2;i<=n/2;i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);

                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check)
                System.out.println(-1);
        }
    }
}
