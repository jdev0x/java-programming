class ProgrammingLanguage{
    private String name;
    
    public ProgrammingLanguage(){
        this.name = "Programming Language";
    }

    public ProgrammingLanguage(String name){
        this.name = name;
    }
}

class Python extends ProgrammingLanguage{

    public Python(){
        super("Python");
    }
}

class Java extends ProgrammingLanguage{

    public Java(){
        super("Java");
    }
}

class CSharp extends ProgrammingLanguage{

    public CSharp(){
        super("C#");
    }
}
public class InheritanceWithConstructorPractice {
    public static void main(String[] args) {
       ProgrammingLanguage pl = new ProgrammingLanguage("hi");
       Python py = new Python();
       Java jv = new Java();
       CSharp cs = new CSharp();0
    }
}
