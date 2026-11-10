package J07084_date;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    String name;
    String timeStart;
    String timeEnd;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime start;
    LocalDateTime end;

    public SinhVien(String name, String timeStart, String timeEnd) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.start = LocalDateTime.parse(timeStart, formatter);
         this.end = LocalDateTime.parse(timeEnd, formatter);
    }

    public long getSoPhut(){
        return Duration.between(start, end).toMinutes();
    }

    public String toString(){
        return name + " " + getSoPhut();
    }
}

public class P {
    public static void main(String[] args) {
        File file = new File("ONLINE.in");
        List<SinhVien> list = new ArrayList<>();
        try(Scanner sc = new Scanner(file)){
            int n = sc.nextInt();
            sc.nextLine();
            while(sc.hasNextLine()){
                String name = sc.nextLine();
                String timeStart = sc.nextLine();
                String timeEnd = sc.nextLine();
                list.add(new SinhVien(name, timeStart, timeEnd));
            }

            list.sort(Comparator.comparing(SinhVien::getSoPhut).reversed());
            list.forEach(System.out::println);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
