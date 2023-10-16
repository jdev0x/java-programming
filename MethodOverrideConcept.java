class ProgrammingLanguage{
    private String name;
    
    public ProgrammingLanguage(){
        this.name = "Programming Language";
    }

    public ProgrammingLanguage(String name){
        this.name = name;
    }

    public void print(String message){
        System.out.println(message);
    }

}

class Python extends ProgrammingLanguage{

    public Python(){
        super("Python");
    }

    public void print(String message){
        super.print(message);
        System.out.println("print(\"" + message + "\")");
    }
}

class Java extends ProgrammingLanguage{

    public Java(){
        super("Java");
    }

    public void print(String message){
        super.print(message);
        System.out.println("System.out.println(\"" + message + "\");");
    }
}

class CSharp extends ProgrammingLanguage{

    public CSharp(){
        super("C#");
    }

    public void print(String message){
        super.print(message);
        System.out.println("Console.WriteLine(\"" + message + "\");");
    }
}

public class MethodOverrideConcept {
    public static void main(String[] args) {
       ProgrammingLanguage pl = new ProgrammingLanguage("hi");
       Python py = new Python();
       Java jv = new Java();
       CSharp cs = new CSharp();

       pl.print("hello");
       py.print("hello");
       jv.print("hello");
       cs.print("hello");
    }
}
