package J05015;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



class Racer{
    private String maRacer;
    private String name;
    private String donVi;
    private String thoiGian;

    public String format(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(Character.toUpperCase(str.charAt(0)));
        }
        return sb.toString();
    }

    public Racer(String name, String donVi, String thoiGian) {
        this.name = name;
        this.donVi = donVi;
        this.thoiGian = thoiGian;
        this.maRacer = format(donVi) + format(name);
    }

    public double getThoiGian(){
        double hour = Double.parseDouble(thoiGian.substring(0, 1)) - 6.0;
        double min = Double.parseDouble(thoiGian.substring(2, 4));
        return hour + min / 60;
    }

    public long getVanToc(){
        return Math.round(120/getThoiGian());
    }

    public String toString(){
        return maRacer + " " + name + " " + donVi + " " + getVanToc() + " Km/h";
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Racer> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            list.add(new Racer(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        list.sort(Comparator.comparing(Racer::getVanToc).reversed());

        for(Racer r : list){
            System.out.println(r);
        }
    }
}
