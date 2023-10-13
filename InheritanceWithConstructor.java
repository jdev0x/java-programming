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
    private String color;

    public Square(){
        super("Square");
        this.color = "Blue";
    }
    public void squareAction(){
        System.out.println("Square");
    }
}

class OutlineSquare extends Square{
    private int size;

    public OutlineSquare(){
        super();
        this.size = 1;
    }

    public OutlineSquare(int size){
        super();
        this.size = size;
    }

    public void outlineSquareAction(){
        System.out.println("outline square");
    }
}

class ColorOutlineSquare extends OutlineSquare{
    private int width;

    public ColorOutlineSquare(){
        super();
        this.width = 1;
    }

    public void colorOutlineSquareAction(){
        System.out.println("color outline square");
    }
}

public class InheritanceWithConstructor {
    public static void main(String[] args) {
       OutlineSquare os = new OutlineSquare();
       ColorOutlineSquare cos = new ColorOutlineSquare();
       
    }
}
