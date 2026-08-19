package J05027;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GiangVien{
    static int id = 1;
    private String maGv;
    private String name;
    private String boMon;

    public GiangVien(String name, String boMon) {
        this.maGv = "GV" + String.format("%02d", id++);
        this.name = name;
        this.boMon = boMon;
    }

    public String tenBoMon(){
        String[] arr = this.boMon.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(Character.toUpperCase(s.charAt(0)));
        }
        return sb.toString();
    }

    public String findByGvName(String keyword){
        String key = keyword.toLowerCase();
        if(this.name.toLowerCase().contains(key)){
            return String.format("%s %s %s", this.maGv, this.name, tenBoMon());
        }
        return "";
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<GiangVien> list = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0){
            list.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }

        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String keyword = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + keyword + ":");
            for(GiangVien gv : list){
                System.out.println(gv.findByGvName(keyword));
            }
        }
    }
}
