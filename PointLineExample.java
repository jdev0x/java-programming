class Point{
    float x;
    float y;

    void print(){
        System.out.println("x-> " + x);
        System.out.println("y-> " + y);
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

        first.start.x = 3.0f;
        first.start.y = 7.37f;

        first.end.x = 92.9f;
        first.end.y = 77.78f;

        first.printLine();
    }
}
