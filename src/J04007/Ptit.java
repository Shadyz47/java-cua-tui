package J04007;

import java.util.Scanner;

class NhanVien{
    private String maNv;
    private String name;
    private String sex;
    private String dob;
    private String address;
    private String taxCode;
    private String contractDate;

    public NhanVien() {
    }

    public NhanVien( String name, String sex, String dob, String address, String taxCode, String contractDate) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }

    public String getMaNv() {
        return maNv;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public String getContractDate() {
        return contractDate;
    }

    public String toString() {
        return "00001" + " " + name + " " + sex + " " + dob + " " + address + " " + taxCode + " " + contractDate;
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien o = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(o);
    }
}
