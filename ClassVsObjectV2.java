class Student{
    int id;
    int age;
    String name;
    Teacher teacher;

    /* constructor method */
    Student(int id, String name, int age, Teacher teacher){
        this.id = id;
        this.age = age;
        this.name = name;
        this.teacher = teacher;
    }

    void printInfo(/* this */){ /* interface */ /* instance method */
        System.out.println(this.id); /* this -> refId ? */
        System.out.println(this.name);
        System.out.println(this.age);
        this.teacher.printInfo();
    }
}
/* class - object (data(variables) + code(methods)) */

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

public class ClassVsObjectV2 {

    /* arguments: pass-by-value and pass-by-r eference */
    public static void changeThisValue(int x){
        x = x * 2;
        System.out.println(x);
    }

    public static void changeThisObject(Teacher teacher){
        teacher.name = "Jojo";
    }

    public static void addToThisValue(char c, int v){
        c = 'b';
        v = 73;
    }

    public static void addtothisobject(Student student){
            student = new Student(10, "sari", 28, null);

    }

    public static void main(String[] args) {
        int theValue = 100;
        Teacher t = new Teacher("Me", 20, 105);
        Student s = new Student(474, "hi", 49, t);

        char cValue = 't';
        int iValue = 27;

        ClassVsObject.addToThisValue(cValue, iValue);
        ClassVsObject.addtothisobject(s);

        System.out.println(cValue);
        System.out.println(iValue);
        System.out.println(s.id);
        ClassVsObject.changeThisValue(theValue);
        ClassVsObject.changeThisObject(t);
        System.out.println(theValue);
        t.printInfo();
     
    }
}
