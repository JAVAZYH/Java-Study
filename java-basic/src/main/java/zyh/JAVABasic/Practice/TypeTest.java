package zyh.JAVABasic.Practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 10:11
 * \
 */
public class TypeTest {
    static {
        System.out.println("1");
    }
    public static void main(String[] args) {
        System.out.println("2");
        //两个数相加时要用容量大的来存储结果
//        int a=10;
//        float num=20.1f;
//        float  b=a+num;
//        System.out.println(b);

        //虽然long类型占8个字节比float4个字节要大，但是因为float类型的容量比
        //long要大所以要用float来接收
//        long a=10L;
//        float b=0.2f;
//        float m=a+b;
//        System.out.println(m);
//
        //byte，short，char类型之间运算会自动提升为int类型
//         byte a=10;
//         char b='a';
//         int c=a+b;
//        System.out.println(c);

//         float a=10.9f;
//        System.out.println((int)a);


    }
}