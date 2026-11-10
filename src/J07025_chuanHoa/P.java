package J07025_chuanHoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class KhachHang{
    static int id = 1;
    String maKH;
    String tenKH;
    String gioiTinh;
    String ngaySinh;
    String diaChi;

    public String chuanHoaName(String s){
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String x: tmp){
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
    public static String chuanHoaNgaySinh(String s){
        if(s.charAt(2) != '/'){
            s = "0" + s;
        }
        if(s.charAt(5) != '/'){
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }


    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = "KH" + String.format("%03d", id++);
        this.tenKH = chuanHoaName(tenKH);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.diaChi = diaChi;
    }

    public String getYear(){
        return ngaySinh.substring(6, 10);
    }

    public String getMonth(){
        return ngaySinh.substring(3, 5);
    }

    public String getDay(){
        return ngaySinh.substring(0, 2);
    }

    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.gioiTinh + " " + this.diaChi + " " + this.ngaySinh;
    }
}

public class P {
    public static void main(String[] args) {
        File file = new File("KHACHHANG.in");
        List<KhachHang> listKH = new ArrayList<>();

        try(Scanner sc = new Scanner(file)){

            int n = Integer.parseInt(sc.nextLine());
            while(n-->0){
                String tenKH = sc.nextLine();
                String gioiTinh = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                listKH.add(new KhachHang(tenKH, gioiTinh, ngaySinh, diaChi));
            }

            listKH.sort(Comparator.comparing(KhachHang::getYear)
                    .thenComparing(KhachHang::getMonth)
                    .thenComparing(KhachHang::getDay));

            listKH.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
