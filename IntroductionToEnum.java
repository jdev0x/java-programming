enum Week{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum Binary{
    ZERO,
    ONE
}

enum TestStatus{
    PASS,
    ABSENT,
    FAIL
}

public class IntroductionToEnum {
    public static void main(String[] args) {
        Week today = Week.FRIDAY;
        Binary firstBit = Binary.ZERO;
        Binary secondBit = Binary.ONE;
        TestStatus OOPTest = TestStatus.PASS;
         

        System.out.println(firstBit);
        System.out.println(secondBit);

        if(today == Week.SATURDAY){
            System.out.println("Today is Saturday!");
        }else{
            System.out.println("Today is " + today);
        }


        if(OOPTest == TestStatus.PASS){
            System.out.println("Congrats you passed!");
        }else{
            System.out.println("u failed!!");
        }

    }
}
