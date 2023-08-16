/* Method Overloading */
class PrinThis{
    String message;

    PrinThis(){
        this.message = "empty";
    }

    PrinThis(String message){
        this.message = message;
    }

    String format (){
        return "_" + this.message + "_";
    }

    String format( String symbol){
        return symbol + this.message + symbol;
    }

    String format(String start, String end){
        return start + this.message + end;
    }
}


class MyMath{
    int aVal;
    int bVal;

    MyMath(){
        this.aVal = 0;
        this.bVal = 0;
    }

    MyMath(int a, int b){
        this.aVal = a;
        this.bVal = b;
    }


    int sum(int first, int second){
        return first + second;
    }

    float sum(float first, float second){
        return first + second;
    }

    double sum(double first, double second){
        return first + second;
    }
}

public class ClassVsObjectMethodOverloading {
    public static void main(String[] args) {
        PrinThis i = new PrinThis("hi");
        
        System.out.println(i.format("<", ">"));
        
       
    }
}
