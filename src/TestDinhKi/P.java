package TestDinhKi;

import java.util.Locale;
import java.util.Scanner;

class NhanVien{
    private String hoten;
    private String chucvu;
    private int soNgay;
    private long luongcb;

    public NhanVien() {
    }

    public NhanVien(String hoten, String chucvu, int soNgay, long luongcb) {
        this.hoten = hoten;
        this.chucvu = chucvu;
        this.soNgay = soNgay;
        this.luongcb = luongcb;
    }

    public void input(Scanner sc){
        this.hoten = sc.nextLine();
        this.luongcb = Long.parseLong(sc.nextLine());
        this.soNgay = Integer.parseInt(sc.nextLine());

        this.chucvu = sc.nextLine();
    }

    public String chuanHoaName(String name){
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String s : tmp){
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public long getLuongThang(){
        return this.soNgay * this.luongcb;
    }

    public double getPhuCap(){
        double phucap = 0;
        if(this.chucvu.equals("GD")){
            phucap = 250000;
        }
        else if(this.chucvu.equals("PGD")){
            phucap = 200000;
        }
        else if(this.chucvu.equals("TP")){
            phucap = 180000;
        }
        else if(this.chucvu.equals("NV")){
            phucap = 150000;
        }
        return  phucap;
    }

    public double getThuong(){
        if(this.soNgay >= 25){
            return (double)(getLuongThang() * 20/100);
        }
        else if(this.soNgay >= 22){
            return (double)(getLuongThang() * 10/100);
        }
        else {
            return 0;
        }
    }

    public String toString(){
        return String.format("%s %d %.1f %.1f", chuanHoaName(this.hoten), getLuongThang(), getPhuCap(), getLuongThang() + getPhuCap() +  getThuong() );
    }
}

public class P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien tc = new NhanVien();
        tc.input(in);
        System.out.println(tc);
    }
}
