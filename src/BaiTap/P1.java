package BaiTap;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DSSP ds = null;
        boolean flag = false;
        System.out.println("1. Nhap ds \n2. Hien thi ds "
                + "\n3. Tim theo ten \n4. Tim tu gia.. den gia..."
                + "\n0. Thoat");
        while (true) {
            int chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("So sp:");
                    int n = Integer.parseInt(in.nextLine());
                    ds = new DSSP(n);
                    ds.nhap(in);
                    flag = true;
                    break;
                case 2:
                    if (flag) {
                        ds.viet();
                    }
                    break;
                case 3:
                    if (flag) {
                        String ten = in.nextLine();
                        ds.timTheoTen(ten);
                    }
                    break;
                case 4:
                    if(flag){
                        double tu=Double.parseDouble(in.nextLine());
                        double den=Double.parseDouble(in.nextLine());
                        ds.timTheoGia(tu, den);
                    }
                    break;
                case 0:System.exit(0);
            }
        }
    }
}
class SanPham {
    private String ma;
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void nhap(Scanner in) {
        this.ma = in.nextLine();
        this.ten = in.nextLine();
        this.gia = Double.parseDouble(in.nextLine());
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.gia;
    }
}
class DSSP {
    private SanPham[] a;

    public DSSP(int n) {
        a = new SanPham[n];
    }

    public void nhap(Scanner in) {
        for(int i =0;i<a.length;i++){
            a[i] = new SanPham();
            a[i].nhap(in);
        }
    }
    public void viet() {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].toString());
        }
    }

    public void timTheoTen(String ten) {
        for(int i=0;i<a.length;i++){
            if(a[i].getTen().contains(ten)){
                System.out.println(a[i].toString());
            }
        }
    }

    public void timTheoGia(double tu, double den) {
        for(int i=0;i<a.length;i++){
            if(a[i].getGia() >= tu && a[i].getGia() <= den){
                System.out.println(a[i].toString());
            }
        }
    }
}


//public static String chuanHoa(String dob) {
//    if (dob.charAt(2) != '/')
//        dob = "0" + dob;
//    if (dob.charAt(5) != '/')
//        dob = dob.substring(0, 3) + "0" + dob.substring(3);
//
//    return dob;
//}

//public static String chuanHoaName(String name){
//    String[] arr = name.trim().toLowerCase().split("\\s+");
//    StringBuilder sb = new StringBuilder();
//    for(String s : arr){
//        sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
//    }
//    return sb.toString().trim();
//}