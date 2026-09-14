package J07018;

import java.io.File;
import java.util.Scanner;

class SinhVien{
    private static int id = 1;
    private String maSv;
    private String hoten;
    private String dob;
    private String lop;
    private double gpa;

    private String chuanHoaHoTen(String hoten){
        StringBuilder sb = new StringBuilder();
        String[] tmp = hoten.trim().toLowerCase().split("\\s+");
        for(String s : tmp){
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaDob(String dob){
        if(dob.charAt(2) != '/'){
            dob = "0" + dob;
        }
        if(dob.charAt(5) != '/'){
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }
        return dob;
    }

    public SinhVien(String hoten, String lop, String dob, double gpa) {
        this.maSv = "B20DCCN" + String.format("%03d", id++);
        this.hoten = chuanHoaHoTen(hoten);
        this.lop = lop;
        this.dob = chuanHoaDob(dob);
        this.gpa = gpa;
    }

    public String toString(){
        return this.maSv + " " + this.hoten + " " + this.lop + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}

public class P {
    public static void main(String[] args){
        File file = new File("SINHVIEN.in");
        try (Scanner sc = new Scanner(file)) {
            int t = sc.nextInt();
            while(t-- > 0){
                sc.nextLine();
                System.out.println(new SinhVien
                        (sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
