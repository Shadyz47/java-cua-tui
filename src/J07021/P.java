package J07021;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class P {
    private static String chuanHoaHoTen(String hoten){
        String[] tmp = hoten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(tmp)
                .forEach(s ->
                        sb.append(Character.toUpperCase(s.charAt(0)))
                                .append(s.substring(1))
                                .append(" "));
        return  sb.toString().trim();
    }

    public static void main(String[] args){
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()){
                String data =  sc.nextLine();

                if(data.equals("END")) break;

                System.out.println(chuanHoaHoTen(data));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
