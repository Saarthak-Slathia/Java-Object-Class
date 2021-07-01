abstract class Object{
    double length;
    double width;
    double height;

    Object(){
        length = 0;
        width = 0;
        height = 0;
    }

    Object(double l, double w, double h){
        length = l;
        width = w;
        height = h;
    }

    Object(double i){
        length = i;
        width = i;
        height = i;
    }

    abstract double area();
    abstract double volume();
}

class Cuboid1 extends Object{
    Cuboid1(){
        super();
    }

    Cuboid1(double l, double w, double h){
        super(l, w, h);
    }

    Cuboid1(double i){
        super(i);
    }

    double area(){
        return length * width;
    }

    double volume(){
        return length * width * height;
    }
}

class Cube extends Object{
    Cube(){
        super();
    }

    Cube(double i){
        super(i);
    }

    double area(){
        return length * length;
    }

    double volume(){
        return length * length * length;
    }
}

public class ObjectsDemo {
    public static void main(String[] args) {
        double length = 15;
        double width = 10;
        double height = 5;

        Cuboid1 cuboid1 = new Cuboid1(length, width, height);

        System.out.println("The area of cuboid1 is " + cuboid1.area());
        System.out.println("The volume of cuboid1 is " + cuboid1.volume());

        Cube cube1 = new Cube(width);

        System.out.println("The area of cube is " + cube1.area());
        System.out.println("The volume of cube is " + cube1.volume());
    }
}
