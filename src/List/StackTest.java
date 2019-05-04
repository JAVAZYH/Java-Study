package List;

import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 16:09
 * \
 */
public class StackTest {
    public static void main(String args[]){
        Stack<String> stack=new Stack<>();
        stack.push( "111" );
        stack.push( "222" );
        stack.push( "333" );
//        System.out.println(   stack.pop() );
        //peek()查看栈顶元素
        System.out.println( stack.peek() );
        System.out.println( stack );
    }


}