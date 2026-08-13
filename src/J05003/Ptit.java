package J05003;

import java.util.Scanner;

class Utils {
    public static String chuanHoa(String dob) {
        if (dob.charAt(2) != '/')
            dob = "0" + dob;
        if (dob.charAt(5) != '/')
            dob = dob.substring(0, 3) + "0" + dob.substring(3);

        return dob;
    }
}

class SinhVien {
    public static int id = 1;

    private String maSv;
    private String name;
    private String dob;
    private String lop;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String name, String lop, String dob, double gpa) {
        this.maSv = "B20DCCN" + String.format("%03d", id++);
        this.name = name;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString() {
        return this.maSv + " "
                + this.name + " "
                + this.lop + " "
                + Utils.chuanHoa(this.dob) + " "
                + String.format("%.2f", this.gpa);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();

            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(sv);
        }
    }
}
