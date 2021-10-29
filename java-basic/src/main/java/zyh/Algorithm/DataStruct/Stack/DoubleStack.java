package zyh.Algorithm.DataStruct.Stack;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 10:00
 * \
 */
public class DoubleStack {
    private final  static int MAX_SIZE=100;
    String[] arr;
    int top1;
    int top2;
    //构造栈
    public DoubleStack(){
        this.arr=new String[MAX_SIZE];
        this.top1=-1;
        this.top2=MAX_SIZE;
    }
    //value为值，stacknumber为需要入栈的第几个栈
    public  void push(String value,int stackNumber){
        if (top1+1==top2){
            System.out.println("栈满");
            return;
        }else if (stackNumber==1){
            top1++;
            arr[top1]=value;
        }else if (stackNumber==2){
            top2--;
            arr[top2]=value;
        }
    }

    //出栈
    public String pop(int stackNumber){
        if (stackNumber==1){
            if (top1==-1){
                return "溢出";
            }
            System.out.println("出栈元素："+arr[top1]);
            arr[top1--]=null;
            return arr[top1--];
        }
        if (stackNumber==2){
            if (top2==MAX_SIZE){
                return "溢出";
        }
            System.out.println("出栈元素:"+arr[top2]);
//            top2++;
            arr[top2++]=null;
            return arr[top2++];
        }
        return "溢出";
    }
    public static void main(String[] args) {
        DoubleStack doubleStack=new DoubleStack();
        doubleStack.push( "入第一个栈，元素为1",1 );
        doubleStack.push( "入第一个栈，元素为2",1 );
        doubleStack.push( "入第一个栈，元素为3",1 );
        doubleStack.push( "入第二个栈，元素为1",2 );
        doubleStack.push( "入第二个栈，元素为2",2 );
        doubleStack.push( "入第二个栈，元素为3",2 );
        System.out.println( Arrays.toString( doubleStack.arr ) );
        doubleStack.pop( 1 );
        doubleStack.pop( 2 );
        System.out.println( Arrays.toString( doubleStack.arr ) );
    }
}