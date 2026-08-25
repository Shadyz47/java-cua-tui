package J05019;

class Tram{
    static int id = 1;
    String maTram;
    String tenTram;
    String timeStart;
    String timeEnd;
    double luongMua;

    public Tram(String tenTram, String timeStart, String timeEnd, double luongMua) {
        this.maTram = "T" + String.format("%02d", id++);
        this.tenTram = tenTram;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.luongMua = luongMua;
    }


}

public class P {
    public static void main(String[] args) {
        System.out.println(1000000000000000000L);
    }
}
