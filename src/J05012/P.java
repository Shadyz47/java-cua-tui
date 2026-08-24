package J05012;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product{
    private String maSp;
    private String tenSp;
    private int soLuong;
    private long donGia;
    private long sale;

    public Product(String maSp, String tenSp, int soLuong, long donGia, long sale) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.sale = sale;
    }

    public long getTongTien(){
        return this.donGia * this.soLuong - this.sale;
    }

    public String toString(){
        return String.format("%s %s %d %d %d %d",
                this.maSp,
                this.tenSp,
                this.soLuong,
                this.donGia,
                this.sale,
                this.donGia * this.soLuong - this.sale);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            list.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextLong()));
        }

        list.sort(Comparator.comparing(Product::getTongTien).reversed());

        for(Product p : list){
            System.out.println(p);
        }
    }
}
