package J04006;

import java.util.Scanner;

class SinhVien{
    private String maSv;
    private String name;
    private String lop;
    private String dob;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String dob, double gpa) {
        this.name = name;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getDob() {
        return dob;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        if (dob.charAt(2) != '/') {
            dob = "0" + dob;
        }
        if (dob.charAt(5) != '/') {
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }

        return "B20DCCN001" + " " + this.name + " " + this.lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());

        System.out.println(sv);
    }
}
