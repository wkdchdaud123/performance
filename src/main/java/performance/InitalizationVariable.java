package performance;

public class InitalizationVariable {


    int a;
    static int aStatic;

    public static void main(String[] args) {

        int b = -1;
        int c ;
        c=0;
        System.out.println(aStatic);
        System.out.println(c);
        System.out.println(new InitalizationVariable().a);

    }
}
