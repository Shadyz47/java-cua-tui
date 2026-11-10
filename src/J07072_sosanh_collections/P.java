package J07072_sosanh_collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class P {
    public static String chuanHoa(String s){
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String str : tmp){
            sb.append(Character.toUpperCase(str.charAt(0)));
            sb.append(str.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static int compare(String s1, String s2){
        String[] tmp1 = s1.split("\\s+");
        String[] tmp2 = s2.split("\\s+");

        if(tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]) != 0){
            return tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]);
        }

        if(tmp1[0].compareTo(tmp2[0]) != 0){
            return tmp1[0].compareTo(tmp2[0]);
        }

        String tenDem1 = s1.length() > 2
                ? s1.substring(s1.indexOf(' ') + 1, s1.lastIndexOf(' '))
                : "";
        String tenDem2 = s2.length() > 2
                ? s2.substring(s2.indexOf(' ') + 1, s2.lastIndexOf(' '))
                : "";
        return tenDem1.compareTo(tenDem2);
    }

    public static void main(String[] args) {
        File file = new File("DANHSACH.in");
        List<String> list = new ArrayList<>();

        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                list.add(chuanHoa(data));
            }

            list.sort(P::compare);
            list.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
