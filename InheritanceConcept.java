class Shape{
    private String name;

    public Shape(){
        this.name = "shape";
    }

    public Shape(String name){
        this.name = name;
    }

    public void draw(){
        System.out.println(this.name);
    }
}

class Square extends Shape{
    public void squareAction(){
        System.out.println("Square");
    }
}

class OutlineSquare extends Square{
    public void outlineSquareAction(){
        System.out.println("outline square");
    }
}

class ColorOutlineSquare extends OutlineSquare{
    public void colorOutlineSquareAction(){
        System.out.println("color outline square");
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
       ColorOutlineSquare square = new ColorOutlineSquare();
       square.draw();
       square.squareAction();
       square.outlineSquareAction();
       square.colorOutlineSquareAction();
    }
}
