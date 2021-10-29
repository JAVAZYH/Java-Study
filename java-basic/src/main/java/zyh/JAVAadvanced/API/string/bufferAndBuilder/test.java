package zyh.JAVAadvanced.API.string.bufferAndBuilder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/8
 * \* Time: 16:34
 * \
 */
public class test {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        sb.append( "abcdefg" );
//        System.out.println(sb);
//        sb.delete( 0,2 );//包头不包尾
//        System.out.println(sb);
//        sb.replace( 0,2,"A" );
//        System.out.println(sb);
//        sb.insert( 0,"aaa" );
//        StringBuffer stringBuffer = new StringBuffer("aaaa");
//        System.out.println(stringBuffer);
        StringBuilder s = new StringBuilder( "ABCDEFGHIJ" );
          s.insert( 3,'k' );
        System.out.println(s.toString());
        s.delete( 5,7 );
        System.out.println(s.toString());

    }
}