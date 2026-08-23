package J05009;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ThiSinh{
    private static int id = 1;
    static double diemMax = 0;
    private int maThiSinh;
    private String fullName;
    private String dob;
    private double diem1;
    private double diem2;
    private double diem3;

    public ThiSinh(String fullName, String dob, double diem1, double diem2, double diem3) {
        this.maThiSinh = id++;
        this.fullName = fullName;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getDiemTong(){
        return this.diem1 + this.diem2 + this.diem3;
    }

    public int getMaThiSinh(){
        return this.maThiSinh;
    }

    public String toString(){
        return String.format("%d %s %s %.1f", this.maThiSinh, this.fullName, this.dob, this.getDiemTong());
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ThiSinh> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            list.add(thiSinh);
        }

        list.sort(Comparator.comparing(ThiSinh::getDiemTong)
                .reversed()
                .thenComparing(ThiSinh::getMaThiSinh));

        list.stream()
                .filter(thiSinh -> thiSinh.getDiemTong() == list.get(0).getDiemTong())
                .forEach(System.out::println);
    }
}
