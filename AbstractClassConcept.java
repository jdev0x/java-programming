abstract class Shape{
    public abstract void draw();
    public void print(){
        System.out.println("shape");
    }
}

abstract class MyShape extends Shape{}

// class UrShape extends MyShape{}


class Rectangle extends Shape{
    public void draw(){
        System.out.print("rectangle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("square");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("circle");
    }
}


public class AbstractClassConcept {
    public static void main(String[] args) {
        // Shape s = new Shape();
        Square q = new Square();
        Circle c = new Circle();

        q.draw();
        c.draw();
    }
}
