package J06005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachHang{
    static int id = 1;
    private String maKh;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang(String hoTen, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKh = "KH" + String.format("%03d", id++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKh() {
        return maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
}

class MatHang{
    static int id = 1;
    private String maMh;
    private String tenMh;
    private String donViTinh;
    private long giaMua;
    private long giaBan;

    public MatHang(String tenMh, String donViTinh, long giaMua, long giaBan) {
        this.maMh = "MH" + String.format("%03d", id++);
        this.tenMh = tenMh;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMh() {
        return maMh;
    }

    public String getTenMh(){
        return tenMh;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
}

class HoaDon{
    static int id = 1;
    private String maHd;
    private KhachHang khachHang;
    private MatHang matHang;
    private List<KhachHang> khachHangList = new ArrayList<>();
    private List<MatHang> matHangList = new ArrayList<>();
    private int soLuong;

    public KhachHang findKhachHangById(String id) {
        for (KhachHang kh : khachHangList) {
            if (kh.getMaKh().equals(id)) {
                return kh;
            }
        }
        return null;
    }

    public MatHang findMatHangById(String id) {
        for (MatHang mh : matHangList) {
            if (mh.getMaMh().equals(id)) {
                return mh;
            }
        }
        return null;
    }

    public HoaDon(String khachHangId, String matHangId, int soLuong, List<KhachHang> khachHangList, List<MatHang> matHangList) {
        this.khachHangList = khachHangList;
        this.matHangList = matHangList;
        this.maHd = "HD" + String.format("%03d", id++);
        this.soLuong = soLuong;
        this.khachHang = findKhachHangById(khachHangId);
        this.matHang = findMatHangById(matHangId);
    }


    public long thanhTien(){
        for (MatHang mh : matHangList) {
            if(mh.getMaMh().equals(matHang.getMaMh())){
                return soLuong * mh.getGiaBan();
            }
        }
        return 0;
    }

    public String toString(){
        return maHd + " "
                + khachHang.getHoTen() + " "
                + khachHang.getDiaChi() + " "
                + matHang.getTenMh() + " "
                + matHang.getDonViTinh() + " "
                + matHang.getGiaMua() + " "
                + matHang.getGiaBan() + " "
                + soLuong + " "
                + thanhTien();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<KhachHang> listKh = new ArrayList<>();
        List<MatHang> listMh = new ArrayList<>();
        List<HoaDon> listHd = new ArrayList<>();

        while(n-->0){
            listKh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int m = sc.nextInt();

        while(m-->0){
            sc.nextLine();
            listMh.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }

        int q = sc.nextInt();

        while(q-- >0){
            sc.nextLine();
            listHd.add(new HoaDon(sc.next(), sc.next(), sc. nextInt(), listKh, listMh));
        }

        for(HoaDon hd : listHd){
            System.out.println(hd);
        }
    }
}
