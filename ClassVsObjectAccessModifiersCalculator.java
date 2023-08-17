/* Access Modifiers */
class Calculator{
    private int firstNumber;
    private int secondNumber;

    public Calculator(int x, int y){
        this.firstNumber = x;
        this.secondNumber = y;
    }

    public int sub(){
        return this.firstNumber - this.secondNumber;
    }

    public int sum(){
        return this.firstNumber + this.secondNumber;
    }

    public int mul(){
        return this.firstNumber * this.secondNumber;
    }

    public int div(){
        if (this.secondNumber == 0){
            return 0;
        }

        return this.firstNumber / this.secondNumber;
    }

}

public class ClassVsObjectAccessModifiersCalculator {
    public static void main(String[] args) {
       Calculator one = new Calculator(20, 2);
       System.out.println(one.sub());
       System.out.println(one.mul());
       System.out.println(one.div());
       System.out.println(one.sum());
       
    }
}
