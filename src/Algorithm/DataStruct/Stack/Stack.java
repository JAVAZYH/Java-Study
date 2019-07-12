package Algorithm.DataStruct.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 9:05
 * \
 */
public class Stack {
    public  final static int MAXI_SIZE=100;
    //创建一个栈
    int data[]=new int[MAXI_SIZE];
    int top;

    //入栈
    public  void push(Stack s ,int value){
        if (s.top==MAXI_SIZE-1){
            return;
        }
        if (s.top==0){
            s.data[s.top]=value;
            return;
        }
        s.top++;
        s.data[s.top]=value;
    }

    //出栈
    public String pop(Stack stack){
        if (stack.top==-1){
            return "出栈错误";
        }
        int tmp=stack.data[top];
        stack.top--;
        return "出栈完毕："+tmp;
    }

    //遍历栈
    public void printStack(Stack stack){
        if (stack.top==-1){
            System.out.println("空栈");
        }
       for(int i=0;i<=stack.top;i++){
           System.out.println(stack.data[i]);
       }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push( stack,2 );
        stack.push( stack,3 );
        stack.push( stack,4 );
        stack.printStack( stack );
//        System.out.println(stack.pop( stack ));
//        stack.printStack( stack );
    }
}