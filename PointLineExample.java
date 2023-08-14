class Point{
    float x;
    float y;

    void print(){
        System.out.println("x-> " + x);
        System.out.println("y-> " + y);
    } 

    void move(float theX, float theY){
        x = theX;
        y = theY;
    }
}

class Line{
    Point start;
    Point end;

    void printLine(){
       start.print();
       end.print();
    }
}

public class PointLineExample {
    public static void main(String[] args) {
        Line first = new Line();
        
        first.start = new Point();
        first.end = new Point();

        first.start.move(3.0f, 7.37f);
        first.end.move(92.9f, 77.78f);
       
        first.printLine();
    }
}
