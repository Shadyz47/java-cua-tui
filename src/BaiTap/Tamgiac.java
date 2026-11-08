package BaiTap;

import java.util.Scanner;

class Point{
    double x;
    double y;

    public Point(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    static Point nextPoint(Scanner sc){
        return new Point(sc);
    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

class Triangle{

    double a, b, c;

    public Triangle(Point point, Point point1, Point point2) {
        this.a = point.distance(point1);
        this.b = point1.distance(point2);
        this.c = point2.distance(point);
    }


    public boolean valid(){
        if(a + b <= c || a + c <= b || b + c <= a){
            return false;
        }
        return true;
    }

    public String getPerimeter(){
        return String.format("%.3f", a + b + c);
    }
}

public class Tamgiac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            }
            else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
