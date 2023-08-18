/* Static Members */
class ObjectCounter{
    public int value;
    public static int counter = 0x00;

    public ObjectCounter(){
        this.value = 0;
        ObjectCounter.counter++;
    }

    public static int getObjectCount(){
        return ObjectCounter.counter;
    }

    public void printValue(){
        System.out.println(this.value);
    }
    
}


public class ClassVsObjectStaticMember {
    public static void main(String[] args) {       
        ObjectCounter v1 = new ObjectCounter();
        ObjectCounter v2 = new ObjectCounter();
        ObjectCounter v3 = new ObjectCounter();
        ObjectCounter v4 = new ObjectCounter();
        System.out.println(ObjectCounter.getObjectCount());
    }
}
