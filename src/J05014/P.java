package J05014;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class GiaoVien{
    public static int id = 1;

    private String maGv;
    private String name;
    private String maXetTuyen;
    private double diemTinHoc;
    private double diemChuyenMon;

    public GiaoVien(String name, String maXetTuyen, double diemTinHoc, double diemChuyenMon) {
        this.maGv = "GV" + String.format("%02d", id++);
        this.name = name;
        this.maXetTuyen = maXetTuyen;
        this.diemTinHoc = diemTinHoc;
        this.diemChuyenMon = diemChuyenMon;
    }

    public double getDiemUuTien(){
        String diemUuTien = this.maXetTuyen.charAt(1) + "";
        switch (diemUuTien) {
            case "1" : return 2.0;
            case "2" : return 1.5;
            case "3" : return 1.0;
            default : return 0.0;
        }
    }

    public String getMonHoc(){
        String monHoc = this.maXetTuyen.charAt(0) + "";
        switch (monHoc) {
            case "A" : return "TOAN";
            case "B" : return "LY";
            case "C" : return "HOA";
            default : return "";
        }
    }

    public double getTongDiem(){
        double diemUuTien = getDiemUuTien();
        return this.diemTinHoc*2 + this.diemChuyenMon + diemUuTien;
    }

    public String getXepLoai(){
        double tmp = getTongDiem();
        return (tmp >= 18 ? "TRUNG TUYEN" : "LOAI");
    }

    public String toString(){
        return this.maGv + " " + this.name + " " + getMonHoc() + " " + String.format("%.1f", getTongDiem()) + " " + getXepLoai();
    }
}

public class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<GiaoVien> list = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            list.add(gv);
        }

        list.sort(Comparator.comparing(GiaoVien::getTongDiem).reversed());

        for (GiaoVien gv : list) {
            System.out.println(gv);
        }
    }
}

