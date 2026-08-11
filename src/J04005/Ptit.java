package J04005;

import java.util.Scanner;

class Student{
    private String name;
    private String dob;
    private double sub1;
    private double sub2;
    private double sub3;
    private double score;

    public Student(String name, String dob, double sub1, double sub2, double sub3) {
        this.name = name;
        this.dob = dob;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.score = sub1 + sub2 + sub3;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public double getSub1() {
        return sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public double getSub3() {
        return sub3;
    }

    public double getScore() {
        return score;
    }

    public String toString(){
        return String.format("%s %s %.1f", this.name, this.dob, this.score);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(stu);
    }
}
