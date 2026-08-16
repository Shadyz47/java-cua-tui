package J05010;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MatHang{
    public static int id = 1;

    private int maMH;
    private String tenMH;
    private String nhomMH;
    private double giaMua;
    private double giaBan;

    public MatHang(String tenMH, String nhomMH, double giaMua, double giaBan) {
        this.maMH = id++;
        this.tenMH = tenMH;
        this.nhomMH = nhomMH;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double getLoiNhuan(){
        return this.giaBan - this.giaMua;
    }

    public String toString(){
        return this.maMH + " "
                + this.tenMH + " "
                + this.nhomMH + " "
                + String.format("%.2f", getLoiNhuan());
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<MatHang> list = new ArrayList<>();

        while(t-- > 0){
            sc.nextLine();
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            list.add(mh);
        }

        list.sort(Comparator.comparing(MatHang::getLoiNhuan).reversed());

        for(MatHang mh : list){
            System.out.println(mh);
        }
    }
}
