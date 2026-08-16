package J04014;

import java.util.Scanner;

class PhanSo{
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
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

    public void toiGian(){
        long k = gcd(this.tuSo,this.mauSo);
        this.tuSo = this.tuSo / k;
        this.mauSo = this.mauSo / k;
    }

    public void phepTinhC(PhanSo other){
        long newTuSo = (long)Math.pow(this.tuSo * other.mauSo + this.mauSo * other.tuSo,2);
        long newMauSo = (long)Math.pow(this.mauSo * other.mauSo,2);

        PhanSo result = new PhanSo(newTuSo,newMauSo);
        result.toiGian();

        PhanSo tmp = new PhanSo(this.tuSo * other.tuSo,this.mauSo * other.mauSo);
        tmp.toiGian();
        PhanSo tmp2 = new PhanSo(tmp.tuSo * result.tuSo,tmp.mauSo * result.mauSo);
        tmp2.toiGian();

        System.out.printf("%d/%d %d/%d",result.tuSo,result.mauSo,tmp2.tuSo,tmp2.mauSo);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(),sc.nextLong());
            a.phepTinhC(b);
            System.out.println();
        }
    }
}
