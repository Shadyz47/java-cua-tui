package J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MonHoc{
    String maMH;
    String tenMH;
    int soTinChi;

    public MonHoc(String maMH, String tenMH, int soTinChi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
    }
}

class HocPhan{
    static int id = 1;
    String maHP;
    String maMH;
    int ngayGiangDay;
    int kipHoc;
    String tenGv;
    String tenPhongHoc;

    public HocPhan(String maMH, int ngayGiangDay, int kipHoc, String tenGv, String tenPhongHoc) {
        this.maHP = "HP" + String.format("%03d", id++);
        this.maMH = maMH;
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGv = tenGv;
        this.tenPhongHoc = tenPhongHoc;
    }

    public int ngayGiangDay(){
        return this.ngayGiangDay;
    }

    public int kipHoc(){
        return this.kipHoc;
    }

    public String tenGv(){
        return this.tenGv;
    }
}

public class P {
    public static void main(String[] args) {
        File file1 = new File("MONHOC.in");
        File file2 = new File("LICHGD.in");

        List<MonHoc> listMonHoc = new ArrayList<>();
        List<HocPhan> listHocPhan = new ArrayList<>();

        try(Scanner sc1 = new Scanner(file1); Scanner sc2 = new Scanner(file2)){

            int n1 = Integer.parseInt(sc1.nextLine());
            while(n1-->0){
                String maMH = sc1.nextLine();
                String tenMH = sc1.nextLine();
                int soTinChi = Integer.parseInt(sc1.nextLine());
                listMonHoc.add(new MonHoc(maMH, tenMH, soTinChi));
            }

            int n2 = Integer.parseInt(sc2.nextLine());
            while(n2-->0){
                String maMH = sc2.nextLine();
                int ngayGiangDay = Integer.parseInt(sc2.nextLine());
                int kipHoc = Integer.parseInt(sc2.nextLine());
                String tenGv = sc2.nextLine();
                String tenPhongHoc = sc2.nextLine();
                listHocPhan.add(new HocPhan(maMH, ngayGiangDay, kipHoc, tenGv, tenPhongHoc));
            }
            String keyword = sc2.nextLine();

            for(MonHoc mh : listMonHoc){
                if(mh.maMH.equals(keyword)){
                    System.out.println("LICH GIANG DAY MON " + mh.tenMH + ":");
                }
            }

            listHocPhan.sort(Comparator.comparing(HocPhan::ngayGiangDay)
                    .thenComparing(HocPhan::kipHoc)
                    .thenComparing(HocPhan::tenGv));

            for(HocPhan hp : listHocPhan){
                if(hp.maMH.equals(keyword)){
                    System.out.println(hp.maHP + " " + hp.ngayGiangDay + " " + hp.kipHoc + " " + hp.tenGv + " " + hp.tenPhongHoc);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
