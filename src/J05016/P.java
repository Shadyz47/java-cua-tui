package J05016;

class Hotel{
    public static int id = 1;
    private String maKH;
    private String tenKH;
    private String soPhong;
    private String ngayNhan;
    private String ngayTra;
    private int giaTien;

    public Hotel(String tenKH, String soPhong, String ngayNhan, String ngayTra, int giaTien) {
        this.maKH = "KH" + String.format("%02d", id++);
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.giaTien = giaTien;
    }
}

public class P {
    public static void main(String[] args) {
        System.out.println(1000000000000000000L);
    }
}
