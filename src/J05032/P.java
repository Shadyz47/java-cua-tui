package J05032;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Human{
    String name;
    String dob;

    Human(String name, String dob){
        this.name = name;
        this.dob = dob;
    }

    public String getYear(){
        return dob.substring(6);
    }

    public String getMonth(){
        return dob.substring(3, 5);
    }

    public String getDay(){
        return dob.substring(0, 2);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Human> list = new ArrayList<>();
        while(n-->0){
            String name = sc.next();
            String dob = sc.next();
            list.add(new Human(name, dob));
        }

        list.sort(Comparator.comparing(Human::getYear)
                .thenComparing(Human::getMonth)
                .thenComparing(Human::getDay));

        System.out.println(list.get(list.size()-1).name);
        System.out.println(list.get(0).name);
    }
}
