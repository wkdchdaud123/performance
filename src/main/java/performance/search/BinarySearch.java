package performance.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinarySearch {

    public static void main(String[] args) {

        int[] intArrays = new int[]{1,3,5,6,7,9};

        int pl = 2000000000;
        int pr = 2100000000;
        int pc = (pl + pr) / 2;
        System.out.println( pc ); // 2050000000 저는 이렇게 나왔으면 하는데 -97483648 이렇게 나오는데...

        // 아래와 같이 쉬프트 하면 된다. ㅎㅎ
        int pcd = pl + pr >>> 1;
        System.out.println(pcd);


        System.out.println(Integer.MIN_VALUE);

        String indexOfalgorithmTest = "test";
        int intIndexOfalgorithmTest = 1234;
        System.out.println(indexOfalgorithmTest.indexOf("est"));





    }


}
