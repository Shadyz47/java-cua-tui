package J04003;

import java.util.Scanner;

class Phanso{
    private long tuSo;
    private long mauSo;

    public Phanso() {
    }
    public Phanso(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public static long gcd(long a,long b){
        while(b!=0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public void toiGian(Phanso other){
        long k = gcd(this.tuSo, this.mauSo);
        this.tuSo = this.tuSo / k;
        this.mauSo = this.mauSo / k;
    }

    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso(sc.nextLong(), sc.nextLong());
        a.toiGian(a);
        System.out.println(a);
    }
}
