package performance.stack;

import java.util.Stack;

public class StackTest {

    // 스택 오버 플로우 좀 테스트 해보자 64 비트의 os에서는 1.6 jdk 이상이면 스택에는 1024 kb (131072Byte)들어가니 stack 한번 넣어보자

    public static void main(String[] args) {
        new StackTest().testMethod();
        Stack stack = new Stack();
        for(long i =0; i< 900000000; i++){
            stack.push(i);
        }
    }

    public void testMethod() {
        for (long i = 0; i < 1000000000; i++){
            targetMethod();
        }
    }

    public void targetMethod() {
        long asd = 1 ;
        long qwe = asd;
    }
}
