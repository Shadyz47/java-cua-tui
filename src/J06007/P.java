package J06007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Subject{
    private String maMh;
    private String tenMh;

    public Subject(String maMh, String tenMh) {
        this.maMh = maMh;
        this.tenMh = tenMh;
    }

    public String getMaMh() {
        return maMh;
    }

    public String getTenMh() {
        return tenMh;
    }
}

class GiangVien{
    private String maGv;
    private String tenGv;
    private double thoiGianDay;

    public GiangVien(String maGv, String tenGv) {
        this.maGv = maGv;
        this.tenGv = tenGv;
        this.thoiGianDay = 0;
    }

    public String getMaGv() {
        return maGv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public double getThoiGianDay() {
        return thoiGianDay;
    }

    public void setThoiGianDay(double thoiGianDay) {
        this.thoiGianDay = thoiGianDay;
    }
}

class TinhGio{
    private String maGv;
    private String maMh;
    private double soGio;
    private List<Subject> subjects;
    private List<GiangVien> giangViens;

    public TinhGio(String maGv, String maMh, double soGio, List<Subject> subjects, List<GiangVien> giangViens) {
        this.maGv = maGv;
        this.maMh = maMh;
        this.soGio = soGio;
        this.giangViens = giangViens;
        this.subjects = subjects;
    }

    public String getNameGv(){
        for(GiangVien gv : giangViens){
            if(gv.getMaGv().equals(maGv)){
                return gv.getTenGv();
            }
        }
        return "";
    }

    public double tinhTongGio(){
        for(GiangVien gv : giangViens){
            if(gv.getMaGv().equals(maGv)){
                gv.setThoiGianDay(gv.getThoiGianDay() + soGio);
                return gv.getThoiGianDay();
            }
        }
        return 0;
    }

    public String toString() {
        String nameGv = getNameGv();
        double tongGio = tinhTongGio();
        return nameGv + " " + String.format("%.2f", tongGio);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Subject> subjects = new ArrayList<>();
        List<GiangVien> giangViens = new ArrayList<>();
        List<TinhGio> tinhGios = new ArrayList<>();
        int n = sc.nextInt();
        while(n-->0){
            subjects.add(new Subject(sc.next(), sc.nextLine()));
        }

        int m = sc.nextInt();
        while(m-->0){
            giangViens.add(new GiangVien(sc.next(), sc.nextLine()));
        }

        int q = sc.nextInt();
        while(q-->0){
            tinhGios.add(new TinhGio(sc.next(), sc.next(), sc.nextDouble(), subjects, giangViens));
        }

        for(TinhGio tg : tinhGios){
            System.out.println(tg);
        }
    }
}
