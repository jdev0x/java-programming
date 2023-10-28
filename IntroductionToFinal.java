final class Shape {
    // public final float PI ;
    // public Shape(){}
    public void draw(){
        System.out.println("shape");
    }
}

class Student{ 
    private int id;
    private String name;

    public Student(){
        id = 0;
        this.name = null;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
}

// class Square extends Shape{
//     public void draw(){
//         System.out.println("square");
//     }
// }

public class IntroductionToFinal {
    public static void main(String[] args) {
        // this -> #
        Student s1 = new Student(); // s1(id, name)
        Student s2 = new Student(); // s2(id, name)

        s1.print();
        s2.print();

    }
}
