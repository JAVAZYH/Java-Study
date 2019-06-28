package Algorithm.DataStruct.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 15:10
 * \
 */
//https://blog.csdn.net/u012732618/article/details/48805185
public class StackCaculate {
    //定义一个char类型的运算符数组
    public char[] op={'+','-','*','/','(',')'};

    /**
     * 中缀转后缀
     */
    public void MidToLast(String str){
        Stack<String> stack=new Stack<>();
        StringBuilder sb=new StringBuilder(  );
        for(int i=0;i<str.length();i++){
            char c=str.charAt( i );
            if (isDigit(c)){
                 sb.append( c );
            }
            else if (isOp( c )){
                stack.push( Character.toString(c) );
            }
        }

    }

    //判断是否是数字
    public boolean isDigit(char c){
        if (c>='0'&& c<='9'){
            return true;
        }
        return false;
    }

    //判断是否是符号
    public boolean isOp(char c){
    for(int i=0;i<op.length;i++){
        if (c==op[i]){
            return  true;
        }
    }
    return false;
    }

    public static void main(String[] args) {
        LT lt=new LT();
        List<String> list=lt.work( "(1+3)+5*4+2/1" );
        lt.printList(list  );
    }
}

/**
 * 读取输入的字符串转为中缀表达式
 */
class LT {

    public char[] op = {'+', '-', '*', '/', '(', ')'};
    public String[] strOp = {"+", "-", "*", "/", "(", ")"};

    public boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public boolean isOp(char c) {
        for (int i = 0; i < op.length; i++) {
            if (op[i] == c) {
                return true;
            }
        }
        return false;
    }

    public boolean isOp(String s) {
        for (int i = 0; i < strOp.length; i++) {
            if (strOp[i].equals( s )) {
                return true;
            }
        }
        return false;
    }

    /**
     * 处理输入的计算式
     *
     * @param str
     * @return
     */
    public List<String> work(String str) {
        List<String> list = new ArrayList<String>();
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt( i );
            if (isDigit( c )) {
                sb.append( c );

            }
            if (isOp( c )) {
                if (sb.toString().length() > 0) {
                    list.add( sb.toString() );
                    sb.delete( 0, sb.toString().length() );
                }
                list.add( c + "" );
            }
        }
        if (sb.toString().length() > 0) {
            list.add( sb.toString() );
            sb.delete( 0, sb.toString().length() );
        }
        return list;
    }

    public void printList(List<String> list) {
        for (String o : list) {
            System.out.print( o + " " );
        }
    }
}