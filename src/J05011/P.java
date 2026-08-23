package J05011;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Gamer{
    private String maUser;
    private String name;
    private String timeIn;
    private String timeOut;

    public Gamer(String maUser,String name, String timeIn, String timeOut) {
        this.maUser = maUser;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public int getHours(){
        int minutesOut = Integer.parseInt(timeOut.substring(3));
        int minutesIn = Integer.parseInt(timeIn.substring(3));
        int hoursOut = Integer.parseInt(timeOut.substring(0, 2));
        int hoursIn = Integer.parseInt(timeIn.substring(0, 2));

        if(minutesOut == 0) {
            minutesOut = 60;
            hoursOut--;
        }
        int hours = hoursOut - hoursIn;

        return hours * 60 + Math.abs(minutesOut - minutesIn);
    }

    public String toString(){
        int thoiGian = getHours();
        int tieng = thoiGian / 60;
        int phut = thoiGian % 60;

        return String.format("%s %s %d gio %d phut", maUser, name, tieng, phut);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Gamer> gamers = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0){
            String maUser = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String timeIn = sc.nextLine();
            String timeOut = sc.nextLine();
            Gamer gamer = new Gamer(maUser, name, timeIn, timeOut);
            gamers.add(gamer);
        }

        gamers.sort(Comparator.comparing(Gamer::getHours).reversed());
        gamers.forEach(System.out::println);
    }
}
