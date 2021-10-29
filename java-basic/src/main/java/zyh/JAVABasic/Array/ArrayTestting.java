package zyh.JAVABasic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/22
 * \* Time: 10:47
 * \
 */
public class ArrayTestting {
    public static void main(String[] args) {
        //数组初始化
        //静态初始化：初始化数组时就赋值
        String [] strings=new String[]{"str1","str2"};
        int [] ints2={1,2};
        //动态初始化，初始化数组时定义数组大小
        String [] strings1=new String[2];

        //输出数组长度
        int length=strings.length;
        System.out.println(length);

        //遍历数组中的元素
        for (int i=0;i<length;i++){
            System.out.println(strings[i]);
        }

        //各种基本数据类型和引用类型数组初始化时的值
        int [] ints=new int[2];
        System.out.println(ints[1]);
        //默认值为0.0
        float[] floats=new float[2];
        System.out.println( floats[1] );
        //默认值为false
        boolean[] booleans=new boolean[2];
        System.out.println(booleans[1]);
        //默认为空字符，Unicode编码为\u0000
        char[] chars=new char[2];
        System.out.println(chars[1]);
        //默认值为null
        String [] strings2=new String[2];
        System.out.println(strings2[1]);
    }
}