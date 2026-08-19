package J05020;

import java.util.*;

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
        int t = sc.nextInt();
        sc.nextLine();

        List<SinhVien> list = new ArrayList<>();

        while (t-- > 0) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

//        list.sort((o1, o2) -> {
//            if (o1.getLop().compareTo(o2.getLop()) == 0) {
//                return o1.getMaSv().compareTo(o2.getMaSv());
//            }
//            return o1.getLop().compareTo(o2.getLop());
//        });

        list.sort(Comparator.comparing(SinhVien::getLop)
                .thenComparing(SinhVien::getMaSv));

        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
