package J07010;

import java.io.File;
import java.util.Scanner;

class SinhVien{
    private static int id = 1;
    private String maSv;
    private String hoTen;
    private String dob;
    private String lop;
    private Double Gpa;

    public SinhVien(String maSv, String hoTen, String lop, String dob, Double Gpa) {
        this.maSv = "B20DCCN" + String.format("%03d", id++);
        this.hoTen = hoTen;
        this.dob = chuanHoaDob(dob);
        this.lop = lop;
        this.Gpa = Gpa;
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

    public String toString(){
        return this.maSv + " " + this.hoTen + " " + this.lop + " " + this.dob + " " + String.format("%.2f", this.Gpa);
    }
}

public class P {

    public static void main(String[] args) {
        File file = new File("SV.in");
        try (Scanner sc = new Scanner(file)) {
            int t = sc.nextInt();
            while(t-- > 0){
                System.out.println(new SinhVien
                        (sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
