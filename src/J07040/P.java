package J07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P {
    public static List<String> readList(String fileName){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<String>) ois.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> readFile(String fileName){
        List<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(fileName))) {
            while(sc.hasNextLine()) list.add(sc.nextLine());
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list1 = readList("NHIPHAN.in").stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> list2 = readFile("VANBAN.in").stream().map(String::toLowerCase).collect(Collectors.toList());

        List<String> res1 = new ArrayList<>();
        List<String> res2 = new ArrayList<>();


        for (String s : list1) {
            Pattern p = Pattern.compile("\\S+");
            Matcher m = p.matcher(s);
            while(m.find()){
                res1.add(m.group());
            }
        }

        for(String s : list2){
            Pattern p = Pattern.compile("\\S+");
            Matcher m = p.matcher(s);
            while(m.find()){
                res2.add(m.group());
            }
        }

        res2.stream()
                .filter(res1::contains)
                .distinct()
                .forEach(System.out::println);
    }
}
