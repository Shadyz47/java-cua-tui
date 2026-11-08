package TestDinhKi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

interface ChucNang{
    void them(Scanner in);
    void hienthi();
    void xoa(String ma);
    void xoaNhieu(String ten);
    void tim(String ma);
    void timNhieu(String ten);
    void timTheoNam(int nam);
    void timTheoDiem(double tu,double den);
    void sua(String ma, Scanner in);
}

class QLSV implements ChucNang{

    private List<SinhVien> a;

    public QLSV(){
        a = new ArrayList<SinhVien>();
    }

    @Override
    public void them(Scanner in) {
        SinhVien sv = new SinhVien();
        sv.nhap(in);
        a.add(sv);
    }

    @Override
    public void hienthi() {
        for(SinhVien sv : a){
            System.out.println(sv);
        }
        System.out.println("Tong sinh vien:" + a.size());
    }

    private int viTri(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void xoa(String ma) {
        int vt = viTri(ma);
        if(vt != -1){
            a.remove(vt);
        }
        else {
            System.out.println("Not found !!");
        }
    }

    @Override
    public void xoaNhieu(String ten) {

    }

    @Override
    public void tim(String ma) {

    }

    @Override
    public void timNhieu(String ten) {

    }

    @Override
    public void timTheoNam(int nam) {

    }

    @Override
    public void timTheoDiem(double tu, double den) {

    }

    @Override
    public void sua(String ma, Scanner in) {

    }
}

class SinhVien{
    private String ma, hoten;
    private Date ngaysinh;
    private boolean gioitinh;
    private double gpa;
    private static int sMa = 1;

    public SinhVien(){

    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void nhap(Scanner in){
        this.ma = String.format("03d", sMa++);
        this.hoten = in.nextLine();
        this.ngaysinh = new Date(in.nextLine());
        this.gioitinh = Boolean.parseBoolean(in.nextLine());
        this.gpa = Double.parseDouble(in.nextLine());
    }

    public SinhVien(String hoten, Date ngaysinh,boolean gioitinh, double gpa) {
        this.ma = String.format("03d", sMa++);
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.gpa = gpa;
    }

    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String t = ma + " " + hoten + " " + f.format(ngaysinh) + " " + (gioitinh ? "Nam" : "Nu") + " " + gpa;
        return t;
    }

}

public class BT1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        while(true){
            System.out.println("1.Nhap \n" +
                    "2.Hien thi \n" +
                    "3.Tim theo ma \n" +
                    "4.Tim theo ten \n" +
                    "5.Xoa (ma) \n" +
                    "6.Xoa (ten) \n" +
                    "7.Sua\n" +
                    "8.Tim theo nam\n" +
                    "9.Tim theo diem\n" +
                    "0.Thoat\n" +
                    "Chon (0-9): \n");

            int chon = Integer.parseInt(in.nextLine());
            switch (chon){
                case 0 -> System.exit(0);
                case 1 -> qlsv.them(in);
                case 2 -> qlsv.hienthi();
                case 3 -> qlsv.tim(in.nextLine());
                case 4 -> qlsv.timNhieu(in.nextLine());
                case 5 -> qlsv.xoa(in.nextLine());
                case 6 -> qlsv.xoaNhieu(in.nextLine());
                case 7 -> qlsv.sua(in.nextLine(), in);
                case 8 -> qlsv.timTheoNam(Integer.parseInt(in.nextLine()));
                case 9 -> qlsv.timTheoDiem(Double.parseDouble(in.nextLine()) , Double.parseDouble(in.nextLine()));
                default -> System.out.println("Chon (0-9): ");
            }

        }
    }
}
