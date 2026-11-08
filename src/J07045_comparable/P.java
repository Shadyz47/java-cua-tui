package J07045_comparable;


import java.io.File;
import java.io.IOException;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String type;
    private String name;
    private int donGia;
    private double phi;
    private String str;

    public LoaiPhong(String str) {
        this.str = str;
        String[] tmp =  str.split("\\s+");
        this.type = tmp[0];
        this.name = tmp[1];
        this.donGia = Integer.parseInt(tmp[2]);
        this.phi = Double.parseDouble(tmp[3]);
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.type + " " + this.name + " " + this.donGia + " " + this.phi;
    }
}

public class P {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
