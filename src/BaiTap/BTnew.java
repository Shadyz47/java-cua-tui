package BaiTap;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Sach{
    static int id = 1;
    private String ma;
    private String ten;
    private String nxb;
    private double gia;
    private int soBan;
    private Date ngayXuatBan;

    public Sach(String ten, double gia, String nxb, int soBan, Date ngayXuatBan) {
        this.ma = String.format("S%03d", id++);
        this.ten = ten;
        this.gia = gia;
        this.nxb = nxb;
        this.soBan = soBan;
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }
}

class NhanVien<T> implements Serializable{
    private T ma;

    public NhanVien(T ma) {
        this.ma = ma;
    }

    public T getMa() {
        return ma;
    }

    public void setMa(T ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ma=" + ma +
                '}';
    }
}

class IOFile{
    public static <T> void ghiFile(List<T> list, String fileName){
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ois.writeObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static <T> List<T> docFile(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

class QLSach{
    private Set<Sach> sachSet;

    public QLSach() {
        sachSet  = new HashSet<>();
    }

    public void nhap(Scanner sc) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        String ten = sc.nextLine();
        String nxb = sc.nextLine();
        double gia = Double.parseDouble(sc.nextLine());
        int soBan = Integer.parseInt(sc.nextLine());
        Date ngayXuatBan = sdf.parse(sc.nextLine().trim());

        sachSet.add(new Sach(ten, gia, nxb, soBan, ngayXuatBan));
    }

    public void inra(){
        for (Sach s : sachSet) {
            System.out.println(s.getGia());
        }
    }
}

class QLSachMap{
    private Map<Integer, Sach> mapSach;

    public QLSachMap() {
        mapSach = new HashMap<>();
    }

    public void nhap(Scanner sc){

    }
}

public class BTnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<NhanVien<String>> list1 = new ArrayList<>();
        list1.add(new NhanVien<>("NV01"));
        list1.add(new NhanVien<>("NV02"));

        List<NhanVien<Integer>> list2 = new ArrayList<>();
        list2.add(new NhanVien<>(3));
        list2.add(new NhanVien<>(4));

        IOFile.ghiFile(list1, "NVString.txt");
        IOFile.ghiFile(list2, "NVInt.txt");

        List<NhanVien<String>> list3 = IOFile.docFile("NVString.txt");
        List<NhanVien<Integer>> list4 = IOFile.docFile("NVInt.txt");

        System.out.println(list3);
        System.out.println(list4);
    }
}
