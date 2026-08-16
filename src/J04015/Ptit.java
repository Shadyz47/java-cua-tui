package J04015;

import java.util.Scanner;

class Sensei{
    private String maGv;
    private String name;
    private long salaryBase;

    public Sensei(String maGv, String name, long salaryBase) {
        this.maGv = maGv;
        this.name = name;
        this.salaryBase = salaryBase;
    }

    public int getBacLuong(String maGv){
        String tmp = maGv.substring(2, 4);
        return Integer.parseInt(tmp);
    }

    public long getPhuCap(String maGv){
        String tmp = maGv.substring(0,2);
        switch (tmp){
            case "HT": return 2000000;
            case "HP": return 900000;
            case "GV": return 500000;
            default: return 0;
        }
    }

    public long getThuNhap(){
        Long res = this.salaryBase * getBacLuong(this.maGv) + getPhuCap(this.maGv);
        return res;
    }

    public String toString(){
        return this.maGv + " " + this.name + " " + getBacLuong(this.maGv) + " " + getPhuCap(this.maGv) + " " + getThuNhap();
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sensei s = new Sensei(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(s);
    }
}
