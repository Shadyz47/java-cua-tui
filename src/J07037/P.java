package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien{
    private String maSV;
    private String name;
    private String sdt;
    private String email;

    public SinhVien(String maSV, String name, String sdt, String email) {
        this.maSV = maSV;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }

    public String toString(){
        return maSV + " " + name + " " + sdt + " " + email;
    }

    public String getTen(){
        return name.substring(name.lastIndexOf(" ") + 1);
    }

    public String getHo(){
        return name.substring(0, name.indexOf(" "));
    }

    public String getTenDem(){
        return name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" "));
    }

    public String getMaSv(){
        return maSV;
    }
}

public class P {
    public static void main(String[] args){
        File file = new File("SINHVIEN.in");
        List<SinhVien> list = new ArrayList<>();
        try(Scanner sc = new Scanner(file)){
            int n = sc.nextInt();
            sc.nextLine();
            while(sc.hasNextLine()){
                String maSV = sc.nextLine();
                String name = sc.nextLine();
                String sdt = sc.nextLine();
                String email = sc.nextLine();
                list.add(new SinhVien(maSV, name, sdt, email));
            }

            list.sort(Comparator.comparing(SinhVien::getTen)
                    .thenComparing(SinhVien::getHo)
                    .thenComparing(SinhVien::getTenDem)
                    .thenComparing(SinhVien::getMaSv));
            list.forEach(System.out::println);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
