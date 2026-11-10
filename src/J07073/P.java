package J07073;

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
    String lyThuyet;
    String thucHanh;

    MonHoc(String maMH, String tenMH, int soTinChi, String lyThuyet, String thucHanh) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getMaMH(){
        return this.maMH;
    }

    public String toString(){
        return maMH + " " + tenMH + " " + soTinChi + " " + lyThuyet + " " + thucHanh;
    }
}

public class P {
    public static void main(String[] args) {
        File file = new File("MONHOC.in");
        List<MonHoc> listMonHoc = new ArrayList<>();

        try(Scanner sc = new Scanner(file)){

            int n = Integer.parseInt(sc.nextLine());
            while(n-->0){
                String maMH = sc.nextLine();
                String tenMH = sc.nextLine();
                int soTinChi = Integer.parseInt(sc.nextLine());
                String lyThuyet = sc.nextLine();
                String thucHanh = sc.nextLine();

                if(!thucHanh.equals("Truc tiep"))
                    listMonHoc.add(new MonHoc(maMH, tenMH, soTinChi, lyThuyet, thucHanh));
            }

            listMonHoc.sort(Comparator.comparing(MonHoc::getMaMH));
            listMonHoc.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
