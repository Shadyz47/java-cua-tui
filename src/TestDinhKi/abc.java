package TestDinhKi;

import java.util.Scanner;

class Tour {
    static int id = 1;
    private String ma;
    private String tu;
    private String den;
    private int soNguoi;
    private double gia;

    public Tour(String tu, String den, int soNguoi, double gia) {
        this.ma = String.format("%03d",id++);
        this.tu = tu;
        this.den = den;
        this.gia = gia;
        this.soNguoi = soNguoi;
    }

    public double getThanhTien(){
        if(this.soNguoi < 5){
            return this.gia * this.soNguoi;
        }
        else if(this.soNguoi <= 10){
            return (this.gia * this.soNguoi) * 90/100;
        }
        else {
            return (this.gia * this.soNguoi) * 80/100;
        }
    }

    public String toString(){
        return String.format("%s-%s*%s %d %.1f %.1f", this.tu, this.den, this.ma, this.soNguoi, this.gia, getThanhTien());
    }
}

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){

            Tour tour = new Tour(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            System.out.println(tour.toString());
        }

    }
}
