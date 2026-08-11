package J04002;

import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


    public String getColor() {
        this.color = this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
        return color;
    }


    public int findArea(){
        return this.width * this.height;
    }

    public int findPerimeter(){
        return 2 * (this.width + this.height);
    }
}

public class Ptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle(sc.nextInt(), sc.nextInt(), sc.next());

        if(rect.getWidth() <= 0 || rect.getHeight() <= 0){
            System.out.println("INVALID");
            return;
        }

        System.out.printf(rect.findPerimeter() + " " + rect.findArea() + " " + rect.getColor());
    }
}
