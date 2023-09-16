class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = "." + name + ".";
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class ClassVsObjectSetAndGet {
    public static void main(String[] args) {
        Student s1 = new Student("Sari", 10);
        Student s2 = new Student("Sari", 10);
        Student s3 = new Student("Sari", 10);
        Student s4 = new Student("Sari", 10);
        
        s1.setName("Sari1");
        s2.setName("Sari2");
        s3.setName("Sari3");
        s4.setName("Sari4");

    }
}
