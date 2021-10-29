package zyh.Algorithm.recursion;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 14:50
 * \
 */
public class CallStack {

    public  static  void greet(String name){
        System.out.println("hello"+name);
    }
    public static void greet2(String name){
        System.out.println("how are"+name);
    }
    public static void bye(){
        System.out.println("bye");
    }

    /**
     * 斐波那契数列后一位的值都等于前两位的和
     * 1,1,2,3,5,8.。。。
     * @param i i:用来控制显示第几位的数
     */
    public  static  int Factorial(int i){
        return i==1||i==2?1:Factorial( i-2 )+Factorial( i-1 );
    }


    public static void main(String[] args) {
        //调用栈：栈被用于存储多个变量
        /**
         * 栈先压入greet方法，执行完后压入greet2方法位于栈顶，
         * 执行完greet2方法后弹出greet2方法，然后打印 getting ready to say
         * 最后把bye（）方法压入栈顶，执行完后弹出，最后弹出greet（）
         */
//        greet( "maggie" );
//        greet2( "maggie" );
//        System.out.println("getting ready to say bye");
//        bye();

        System.out.println(Factorial( 6 ));

    }

}