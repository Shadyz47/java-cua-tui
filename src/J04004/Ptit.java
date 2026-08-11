package J04004;

import java.util.Scanner;

class Phanso{
    private long tuSo;
    private long mauSo;

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

    public String tong(Phanso other){
        long tuSoNew = this.tuSo * other.mauSo + this.mauSo * other.tuSo;
        long mauSoNew = this.mauSo * other.mauSo;

        Phanso result = new Phanso(tuSoNew, mauSoNew);
        result.toiGian(result);
        return result.getTuSo() + "/" + result.getMauSo();
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso(sc.nextLong(), sc.nextLong());
        Phanso b = new Phanso(sc.nextLong(), sc.nextLong());
        a.toiGian(b);
        System.out.println(a.tong(b));
    }
}
