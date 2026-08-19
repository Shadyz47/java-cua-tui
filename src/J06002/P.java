package J06002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SanPham{
    private String maSp;
    private String tenSp;
    private double donGia1;
    private double donGia2;

    public SanPham(String maSp, String tenSp, double donGia1, double donGia2) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia1() {
        return donGia1;
    }

    public double getDonGia2() {
        return donGia2;
    }
}

class HoaDon{
    public static int id = 1;
    private String maHoaDon;
    private List<SanPham> sanPhamList;
    private int soLuongMua;

    public HoaDon(String maHoaDon, int soLuongMua, List<SanPham> sanPhamList) {
        this.maHoaDon = maHoaDon + "-" + String.format("%03d", id++);
        this.soLuongMua = soLuongMua;
        this.sanPhamList = sanPhamList;
    }

    public String getMaSanPham(){
        return this.maHoaDon.substring(0, 2);
    }

    public String getLoaiSanPham(){
        return this.maHoaDon.substring(2, 3);
    }

    public String getTenSanPham(){
        for(SanPham sp : sanPhamList){
            if(sp.getMaSp().equals(getMaSanPham())){
                return sp.getTenSp();
            }
        }
        return "";
    }

    public Double getGiaTienSanPham(){
        for(SanPham sp : sanPhamList){
            if(sp.getMaSp().equals(getMaSanPham()) && getLoaiSanPham().equals("1")){
                return sp.getDonGia1();
            }
            else if(sp.getMaSp().equals(getMaSanPham()) && getLoaiSanPham().equals("2")){
                return sp.getDonGia2();
            }
        }
        return 0.0;
    }

    public double calculateSale(){
        double tongTien = (double)this.soLuongMua * getGiaTienSanPham();
        if(this.soLuongMua >= 150) return tongTien * 0.5;
        else if (this.soLuongMua >= 100) return tongTien * 0.3;
        else if (this.soLuongMua >= 50) return tongTien * 0.15;
        else return 0.0;
    }

    public double getTongTien(){
        double tongTien = this.soLuongMua * getGiaTienSanPham();
        return tongTien - calculateSale();
    }

    public String toString(){
        return String.format("%s %s %.0f %.0f", this.maHoaDon, getTenSanPham(), calculateSale(), getTongTien());
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<SanPham> list = new ArrayList<>();
        List<HoaDon> hoaDonList = new ArrayList<>();

        while(t-- >0){
            sc.nextLine();
            list.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }

        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            HoaDon hd = new HoaDon(sc.next(), sc.nextInt(), list);
            hoaDonList.add(hd);
        }

        hoaDonList.sort(Comparator.comparing(HoaDon::getTongTien).reversed());
        for(HoaDon hd : hoaDonList){
            System.out.println(hd);
        }
    }
}
