package J05013;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class NhanVien{
    private static int id = 1;
    private String maNv;
    private String name;
    private double diemThucHanh;
    private double diemLythuyet;

    public NhanVien(String name, double diemThucHanh, double diemLythuyet) {
        this.maNv = "TS" + String.format("%02d", id++);
        this.name = name;
        this.diemThucHanh = diemThucHanh;
        this.diemLythuyet = diemLythuyet;
    }

    public double chuanHoaDiem(double diem){
        if(diem <= 10) return diem;
        else return diem / 10;
    }

    public double getDiemThi(){
        return (chuanHoaDiem(this.diemThucHanh) + chuanHoaDiem(this.diemLythuyet)) / 2;
    }

    public String xepLoai(){
        double diemThi = getDiemThi();
        if(diemThi < 5) return "TRUOT";
        else if(diemThi >= 5 && diemThi < 8) return "CAN NHAC";
        else if(diemThi >= 8 && diemThi < 9.5) return "DAT";
        else return "XUAT SAC";
    }

    public String toString(){
        return this.maNv + " " + this.name + " " + String.format("%.2f", getDiemThi()) + " " + xepLoai();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            list.add(new NhanVien(sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }

        list.sort(Comparator.comparing(NhanVien::getDiemThi).reversed());

        for(NhanVien nv : list){
            System.out.println(nv);
        }
    }
}
