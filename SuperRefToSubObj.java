abstract class Shape{
    public int v1;
    public abstract void draw();
    public void print(){
        System.out.println("shape");
    }
}

abstract class MyShape extends Shape{}

// class UrShape extends MyShape{}

class Rectangle extends Shape{
    public int v8;
    public void draw(){
        System.out.print("rectangle");
    }
}

class Square extends Shape{
    public int v2;
    public int v3;
    public void draw(){
        System.out.println("square");
    }
}

class Circle extends Shape{
    public int v4;
    public void draw(){
        System.out.println("circle");
    }
}

class MyCircle extends Circle{
    public int v7;
}


public class SuperRefToSubObj {
    public static void main(String[] args) {

        // MyCircle mc = new Circle();
        Circle c = new MyCircle();

        Shape [] shapes = {
            new Square(),
            new Circle(),
            new Circle(),
            new Rectangle()
        }; 

        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
