package J05018;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class HocSinh{
    public static int id = 1;

    private String maHs;
    private String name;
    private float toan;
    private float tiengViet;
    private float ngoaiNgu;
    private float vatLy;
    private float hoaHoc;
    private float sinhHoc;
    private float lichSu;
    private float diaLy;
    private float gdcd;
    private float congNghe;

    public HocSinh(String name, float toan, float tiengViet, float ngoaiNgu, float vatLy, float hoaHoc, float sinhHoc, float diaLy, float lichSu, float gdcd, float congNghe) {
        this.maHs = "HS" + String.format("%02d", id++);
        this.name = name;
        this.toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.vatLy = vatLy;
        this.hoaHoc = hoaHoc;
        this.sinhHoc = sinhHoc;
        this.diaLy = diaLy;
        this.lichSu = lichSu;
        this.gdcd = gdcd;
        this.congNghe = congNghe;
    }

    public float diemTrungBinh() {
        return (toan*2 + tiengViet*2 + ngoaiNgu + vatLy + hoaHoc + sinhHoc + lichSu + diaLy + gdcd + congNghe) / 12;
    }

    public String xepLoai(){
        float dtb = diemTrungBinh();
        if(dtb >= 9) return "XUAT SAC";
        else if(dtb >= 8) return "GIOI";
        else if(dtb >= 7) return "KHA";
        else if(dtb >= 5) return "TB";
        else return "YEU";
    }

    public String getMaHs() {
        return maHs;
    }

    public String toString() {
        float dtb = Math.round(diemTrungBinh() * 10) / 10.0f;
        return maHs + " " + name + " " + String.format("%.1f", dtb) + " " + xepLoai();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<HocSinh> list = new ArrayList<>();

        while(t-- > 0){
            sc.nextLine();
            list.add(new HocSinh(sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }

        list.sort(Comparator.comparing((HocSinh::diemTrungBinh))
                .reversed()
                .thenComparing(HocSinh::getMaHs));

        for(HocSinh hs : list){
            System.out.println(hs);
        }
    }
}
