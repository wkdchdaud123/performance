package performance;

import java.util.LinkedList;
import java.util.List;

public class thisTest {


    public static void main(String[] args) {
        new thisTest(10,20,30,400);

        int sum = 0;
        for(int i = 0; i < 2; i++){
            sum += i;
        }
        System.out.println(sum/2);
    }


    thisTest(int a, int b, int c, int d){
        this.finalTest = c;
        this.testInt = a;
    }

    private int testInt;
    private static int testStaticInt;
    private final int finalTest;
    private static final int staticFinalTest = 0;






}
