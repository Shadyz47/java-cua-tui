package J04013;

import java.util.Scanner;

class ThiSinh {
    private String maThiSinh;
    private String fullName;
    private double math;
    private double physics;
    private double chemistry;
    private double total;
    private double uuTien;

    public ThiSinh() {
    }

    public ThiSinh(String maThiSinh, String fullName, double math, double physics, double chemistry) {
        this.maThiSinh = maThiSinh;
        this.fullName = fullName;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void khuVuc() {
        String khuVucUuTien = this.maThiSinh.substring(0, 3);
        switch (khuVucUuTien) {
            case "KV1":
                this.total = this.math * 2 + this.physics + this.chemistry;
                this.uuTien = 0.5;
                break;
            case "KV2":
                this.total = this.math * 2 + this.physics + this.chemistry;
                this.uuTien = 1.0;
                break;
            case "KV3":
                this.total = this.math * 2 + this.physics + this.chemistry;
                this.uuTien = 2.5;
                break;
        }

        System.out.println(this.maThiSinh + " "
                + this.fullName + " "
                + (this.uuTien == 1.0 ? (int) this.uuTien : String.format("%.1f", this.uuTien)) + " "
                + (this.total == (int) this.total ? (int) this.total : String.format("%.1f", this.total)) + " "
                + ((this.total + this.uuTien) >= 24 ? " TRUNG TUYEN" : " TRUOT")
        );
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        thiSinh.khuVuc();
    }
}
