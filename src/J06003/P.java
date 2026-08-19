package J06003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien{
    private String maSv;
    private String hoTen;
    private String sdt;
    private int stt;

    public SinhVien(String maSv, String hoTen, String sdt, int stt) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }

    public String toString(){
        return maSv + " " + hoTen + " " + sdt;
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSv = sc.nextInt();
        int soNhom = sc.nextInt();
        List<SinhVien> listSv = new ArrayList<>();
        List<String> listDeTai = new ArrayList<>();

        while(soSv-- > 0){
            sc.nextLine();
            listSv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }

        sc.nextLine();
        while(soNhom-- >0){
            listDeTai.add(sc.nextLine());
        }

        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            System.out.println("DANH SACH NHOM " + n + ":");
            for(SinhVien sv : listSv){
                if(sv.getStt() == n){
                    System.out.println(sv);
                }
            }
            System.out.println("Bai tap dang ky: " + listDeTai.get(n-1));
        }
    }
}
