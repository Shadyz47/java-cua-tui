package TN02012;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PhongBan{
    private String maPb;
    private String tenPb;

    public PhongBan(String maPb, String tenPb) {
        this.maPb = maPb;
        this.tenPb = tenPb;
    }

    public String getMaPb() {
        return maPb;
    }

    public String getTenPb() {
        return tenPb;
    }
}

class NhanVien{
    private String maNv;
    private String hoTen;
    private long luongCoBan;
    private long soNgayCong;
    private List<PhongBan> phongBanList;

    public NhanVien(String maNv, String hoTen, long luongCoBan, long soNgayCong, List<PhongBan> phongBanList) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.phongBanList = phongBanList;
    }

    public String getMaNv() {
        return maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public long getSoNgayCong() {
        return soNgayCong;
    }

    public String getMaPhongBan(){
        return this.maNv.substring(3,5);
    }

    public String getNhomNv(){
        return this.maNv.substring(0,1);
    }

    public Integer getSoNamCongTac(){
        return Integer.parseInt(this.maNv.substring(1,3));
    }

    public String getPhongBan(){
        for(PhongBan pb : phongBanList){
            if(pb.getMaPb().equals(this.getMaPhongBan())){
                return pb.getTenPb();
            }
        }
        return "";
    }

    public Long tongLuong(){
        int soNamCongTac = this.getSoNamCongTac();
        if(this.getNhomNv().equals("A")){
            if(soNamCongTac >=1 && soNamCongTac <=3){
                return this.luongCoBan * this.soNgayCong*10*1000;
            } else if(soNamCongTac >=4 && soNamCongTac <=8){
                return this.luongCoBan * this.soNgayCong*12*1000;
            } else if(soNamCongTac >=9 && soNamCongTac <=15){
                return this.luongCoBan * this.soNgayCong*14*1000;
            } else {
                return this.luongCoBan * this.soNgayCong*20*1000;
            }
        }
        else if(this.getNhomNv().equals("B")){
            if(soNamCongTac >=1 && soNamCongTac <=3){
                return this.luongCoBan * this.soNgayCong*10*1000;
            } else if(soNamCongTac >=4 && soNamCongTac <=8){
                return this.luongCoBan * this.soNgayCong*11*1000;
            } else if(soNamCongTac >=9 && soNamCongTac <=15){
                return this.luongCoBan * this.soNgayCong*13*1000;
            } else {
                return this.luongCoBan * this.soNgayCong*16*1000;
            }
        }
        else if (this.getNhomNv().equals("C")) {
            if(soNamCongTac >=1 && soNamCongTac <=3){
                return this.luongCoBan * this.soNgayCong*9*1000;
            } else if(soNamCongTac >=4 && soNamCongTac <=8){
                return this.luongCoBan * this.soNgayCong*10*1000;
            } else if(soNamCongTac >=9 && soNamCongTac <=15){
                return this.luongCoBan * this.soNgayCong*12*1000;
            } else {
                return this.luongCoBan * this.soNgayCong*14*1000;
            }
        }
        else {
            if(soNamCongTac >=1 && soNamCongTac <=3){
                return this.luongCoBan * this.soNgayCong*8*1000;
            } else if(soNamCongTac >=4 && soNamCongTac <=8){
                return this.luongCoBan * this.soNgayCong*9*1000;
            } else if(soNamCongTac >=9 && soNamCongTac <=15){
                return this.luongCoBan * this.soNgayCong*11*1000;
            } else {
                return this.luongCoBan * this.soNgayCong*13*1000;
            }
        }
    }

    public String toString(){
        return maNv + " "
                + hoTen + " "
                + getPhongBan() + " "
                + tongLuong();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<PhongBan> phongBanList = new ArrayList<>();
        List<NhanVien> nhanVienList = new ArrayList<>();

        while(n-->0){
            phongBanList.add(new PhongBan(sc.next(), sc.nextLine()));
        }

        int m = sc.nextInt();
        while(m-->0){
            sc.nextLine();
            nhanVienList.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), phongBanList));
        }

        for(NhanVien nv : nhanVienList){
            System.out.println(nv);
        }
    }
}
