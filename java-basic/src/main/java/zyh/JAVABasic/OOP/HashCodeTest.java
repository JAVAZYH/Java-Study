package zyh.JAVABasic.OOP;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 14:34
 * \
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String s="ok";
        StringBuilder sb=new StringBuilder( s );
        System.out.println(s.hashCode()+" "+sb.hashCode());
        String t=new String( "ok1" );
        StringBuilder tb=new StringBuilder( t );
        System.out.println(t.hashCode()+" "+tb.hashCode());
    }

}