/* Access Modifiers */
class BasicMath{
    private int first;
    private int second;

    public BasicMath(){
        this.first = 0;
        this.second = 0;
    }

    public BasicMath(int a, int b){
        this.first = a;
        this.second = b;
    }

    public int sum(){
        return this.first + this.second;
    }

    public int sub(){
        return this.first - this.second;
    }
}

public class ClassVsObjectAccessModifiers {
    public static void main(String[] args) {
        BasicMath bm = new BasicMath(40, 30);
        int result = bm.sum();
        System.out.println(result);
        result = bm.sub();
        System.out.println(result);        
       
    }
}
