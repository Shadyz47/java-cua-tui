package J04012;

import java.util.Scanner;

class NhanVien{
    private String maNv;
    private String name;
    private long salary;
    private int ngayCong;
    private String chucVu;
    private long luongCoBan;
    private long thuong;
    private long phuCap;
    private long thuNhap;

    public NhanVien() {
    }

    public NhanVien(String name, long salary, int ngayCong, String chucVu) {
        this.name = name;
        this.salary = salary;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    public void calculateSalary(){
        this.luongCoBan = this.salary * this.ngayCong;

        switch (chucVu){
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
        }

        if(this.ngayCong >= 25) {
            this.thuong = (long) (this.luongCoBan * 0.2);
        }
        else if (this.ngayCong >= 22 ) {
            this.thuong = (long) (this.luongCoBan * 0.1);
        }
        else {
            this.thuong = 0;
        }

        this.thuNhap = this.luongCoBan + this.phuCap + this.thuong;

        System.out.printf("%s %s %d %d %d %d%n", this.maNv = "NV01", this.name, this.luongCoBan, this.thuong,this.phuCap, this.thuNhap);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien n = new NhanVien(sc.nextLine(), sc.nextLong(), sc.nextInt(), sc.next());
        n.calculateSalary();
    }
}
