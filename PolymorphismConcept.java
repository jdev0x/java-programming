import org.w3c.dom.css.Rect;

class Action{
    /* overload */
    public void doAction(){}
    public void doAction(int value){}
    public void doAction(int firstValue, int secondValue){}
}

class Shape{
    public int v1;
    public void draw(){
        System.out.println("shape");
    }
}

class Circle extends Shape{
    /* override */
    public void draw(){
        System.out.println("circle");
    }
}

class Square extends Shape{
    public int v2;
    public void draw(){
        System.out.println("square");
    }
}

class AdvancedSquare extends Square{ public int v3; }

class Rectangle extends Shape{
    public void draw(){
        System.out.println("rectangle");
    }
}

class Triangle extends Shape{}

public class PolymorphismConcept {
    public static void main(String[] args) {
        Shape [] shapes = {new Square(), new Square(),
            new Circle(), new Circle(),
            new Rectangle(), new Rectangle(), new Rectangle()
        };

        for(Shape shape : shapes){
            shape.draw();
        }

    }
}
