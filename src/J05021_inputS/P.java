package J05021_inputS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    private String maSv;
    private String name;
    private String lop;
    private String email;

    public SinhVien(String maSv, String name, String lop, String email) {
        this.maSv = maSv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", maSv, name, lop, email);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();

        while(sc.hasNext()){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        sc.close();

        list.sort(Comparator.comparing(SinhVien::getMaSv));
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
