package J07013;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class SinhVien{
    private int id;
    private String maSv;
    private String hoTen;
    private String dob;
    private String lop;
    private Double Gpa;

    public SinhVien(int id,String maSv, String hoTen, String lop, String dob, Double Gpa) {
        this.id = id;
        this.maSv = "B20DCCN" + String.format("%03d", id);
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
    public static ArrayList<SinhVien> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (ArrayList<SinhVien>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = readList("SV.in");
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
