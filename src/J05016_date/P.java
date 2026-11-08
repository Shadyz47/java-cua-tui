package J05016_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Hotel{
    public static int id = 1;
    private String maKH;
    private String tenKH;
    private String soPhong;
    private String ngayNhan;
    private String ngayTra;
    private int giaTien;

    public Hotel(String tenKH, String soPhong, String ngayNhan, String ngayTra, int giaTien) {
        this.maKH = "KH" + String.format("%02d", id++);
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.giaTien = giaTien;
    }

    public int soTienPhong(){
        String floor = this.soPhong.substring(0, 1);
        if(floor.equals("1"))
            return 25;
        else if(floor.equals("2"))
            return 34;
        else if(floor.equals("3"))
            return 50;
        else
            return 80;
    }

    public int soNgayO(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate nhan = LocalDate.parse(this.ngayNhan.trim(), formatter);
        LocalDate tra = LocalDate.parse(this.ngayTra.trim(), formatter);
        return (int) ChronoUnit.DAYS.between(nhan, tra) + 1;
    }

    public int tongThanhTien(){
        return soTienPhong() * soNgayO() + this.giaTien;
    }

    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.soPhong + " " + soNgayO() +  " " + tongThanhTien();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Hotel> list = new ArrayList<>();

        while(t-->0){
            sc.nextLine();
            Hotel hotel = new Hotel(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            list.add(hotel);
        }

        list.sort(Comparator.comparing(Hotel::tongThanhTien).reversed());
        for(Hotel hotel : list){
            System.out.println(hotel);
        }
    }
}
