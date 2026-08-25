package J05017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class KhachHang{
    static int id = 1;
    String maKh;
    String tenKh;
    int oldChiSo;
    int newChiSo;

    public KhachHang(String tenKh, int oldChiSo, int newChiSo) {
        this.maKh = "KH" + String.format("%02d", id++);
        this.tenKh = tenKh;
        this.oldChiSo = oldChiSo;
        this.newChiSo = newChiSo;
    }

    public long getTongTien(){
        int soDienUsed = this.newChiSo - this.oldChiSo;
        double tien = 0;
        double phuPhi = 0;

        if (soDienUsed <= 50) {
            tien = soDienUsed * 100;
            phuPhi = 0.02;
        } else if (soDienUsed <= 100) {
            tien = 50 * 100 + (soDienUsed - 50) * 150;
            phuPhi = 0.03;
        } else {
            tien = 50 * 100 + 50 * 150 + (soDienUsed - 100) * 200;
            phuPhi = 0.05;
        }

        return Math.round(tien * (1 + phuPhi));
    }

    public String toString(){
        return this.maKh + " " + this.tenKh + " " + this.getTongTien();
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<KhachHang> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            list.add(new KhachHang(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        list.sort(Comparator.comparing(KhachHang::getTongTien).reversed());
        list.forEach(System.out::println);
    }
}
