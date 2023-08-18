/* Static Members */
class ObjectCounter{
    public int value;
    public static int counter = 0x00;

    public ObjectCounter(){
        this.value = 0;
        ObjectCounter.counter++;
    }

    public ObjectCounter(int value){
        this.value = value;
        ObjectCounter.counter++;
    }

    public static int getObjectCount(){
        return ObjectCounter.counter;
    }

    public void printValue(){
        System.out.println(this.value);
    }

}

public class ClassVsObjectStaticMemberV2 {
    public static void main(String[] args) {       
        ObjectCounter v1 = new ObjectCounter();
        ObjectCounter v2 = new ObjectCounter(10);
        System.out.println(ObjectCounter.getObjectCount());
    }
}
