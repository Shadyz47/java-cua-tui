package J05007;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class NhanVien{
    public static int id = 1;

    private String maNv;
    private String name;
    private String sex;
    private String dob;
    private String address;
    private String taxCode;
    private String contractDate;

    public NhanVien(String name, String sex, String dob, String address, String taxCode, String contractDate) {
        this.maNv = String.format("%05d", id++);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }

    public String getDob(){
        StringBuilder sb = new StringBuilder(this.dob);
        String year = sb.substring(6, 10);
        String month = sb.substring(3, 5);
        String day = sb.substring(0, 2);

        return year + "/" + month + "/" + day;
    }

    public String toString() {
        return this.maNv + " "
                + this.name + " "
                + this.sex + " "
                + this.dob + " "
                + this.address + " "
                + this.taxCode + " "
                + this.contractDate;
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<NhanVien> list = new ArrayList<>();

        sc.nextLine();
        while(t-- > 0){
            list.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        list.sort(Comparator.comparing(NhanVien::getDob));
        for(NhanVien nv : list){
            System.out.println(nv);
        }
    }
}
