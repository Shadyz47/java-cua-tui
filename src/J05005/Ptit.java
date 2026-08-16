package J05005;

import java.util.*;

class Utils{
    public static String chuanHoaDob(String dob) {
        if (dob.charAt(2) != '/')
            dob = "0" + dob;
        if (dob.charAt(5) != '/')
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        return dob;
    }

    public static String chuanHoaName(String name){
        String[] arr = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}

class SinhVien{
    public static int id = 1;

    private String maSv;
    private String name;
    private String dob;
    private String lop;
    private double gpa;

    public SinhVien() {
    }

    public double getGpa() {
        return gpa;
    }

    public SinhVien(String name, String lop, String dob, double gpa) {
        this.maSv = "B20DCCN" + String.format("%03d", id++);
        this.name = name;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString() {
        return this.maSv + " "
                + Utils.chuanHoaName(this.name) + " "
                + this.lop + " "
                + Utils.chuanHoaDob(this.dob) + " "
                + String.format("%.2f", this.gpa);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }

        sv.sort(Comparator.comparing(SinhVien::getGpa).reversed());
        for(SinhVien s : sv){
            System.out.println(s);
        }
    }
}
