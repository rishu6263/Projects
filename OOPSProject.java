import java.util.Scanner;

abstract class Shape{                                          //Created Abstract class
    Scanner sc=new Scanner(System.in);
    float area;
    float radius;
    float length;
    float breadth;
    abstract public void input();
    abstract public void compute();
    public void display(){
        System.out.println("The area is ->"+area);
    }
}
class Circle extends Shape{                        //Achieving Polymorphism,so we have to implement abstract methods that are there in Abstract class


    @Override
    public void input() {
        System.out.println("Enter the radius of the circle ");
        radius=sc.nextFloat();
    }

    @Override
    public void compute() {
    area= (float) (3.14*radius*radius);
    }
}
class Rectangle extends Shape{                  //Achieving Polymorphism ,so we have to implement abstract methods that are there in Abstract class
    @Override
    public void input() {
        System.out.println("Enter the length of the rectangle ");
        length=sc.nextFloat();
        System.out.println("Enter the length of the rectangle ");
        breadth=sc.nextFloat();
    }

    @Override
    public void compute() {
        area=length*breadth;
    }
}
class Square extends Shape{                    //Achieving Polymorphism ,so we have to implement abstract methods that are there in Abstract class
    @Override
    public void input() {
        System.out.println("Enter the length of the square ");
        length=sc.nextFloat();
    }

    @Override
    public void compute() {
    area=length*length;
    }
}
class Geometry {
    public void poly(Shape ref) {
        ref.input();
        ref.compute();
        ref.display();
    }
}
public class OOPSProject{
    public static void main(String[] args) {
    Shape c=new Circle();
    Shape r=new Rectangle();
    Shape s=new Square();

    Geometry gm=new Geometry();
        gm.poly(c);
        gm.poly(r);
        gm.poly(s);

    }
}