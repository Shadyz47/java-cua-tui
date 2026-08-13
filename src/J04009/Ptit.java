package J04009;

import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());

            double AB = A.distance(B);
            double AC = A.distance(C);
            double BC = B.distance(C);

            if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB){
                System.out.println("INVALID");
                continue;
            }

            double p = (AB + BC + AC) / 2;
            System.out.println(String.format("%.2f", Math.sqrt(p * (p - AB) * (p - AC) * (p - BC))));
        }
    }
}
