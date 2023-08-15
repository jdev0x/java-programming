/* members of the class */
class Student{
    /* data: variables */
    /* instance variables */
    int id;
    int age;
    String name;
    Teacher teacher;

    Student(int id, String name, int age, Teacher teacher){ /* constructor method */
        this.id = id;
        this.age = age;
        this.name = name;
        this.teacher = teacher;
    }

    /* code: methods */
    void printInfo(/* this */){ /* interface */ /* instance method */
        System.out.println(this.id); /* this -> refId ? */
        System.out.println(this.name);
        System.out.println(this.age);
        this.teacher.printInfo();
    }
}

class Teacher{
    String name;
    int age;
    int id;

    Teacher(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }
}

public class ClassVsObject {
    public static void main(String[] args) {
        /* new: is an operator -> create a new object of X */
        Teacher a = new Teacher("Abdullah", 12, 99);
        Student j = new Student(10, "Jojo", 15, a); // j -> refId -> object
        Student s = new Student(121, "Sari", 11, a);

        j.printInfo(); /* Student.printInfo(j) */ 
        s.printInfo(); /* Student.printInfo(s) */
        //a.printInfo();
    }
}
