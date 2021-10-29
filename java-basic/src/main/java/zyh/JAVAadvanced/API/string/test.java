package zyh.JAVAadvanced.API.string;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/8
 * \* Time: 10:14
 * \
 */
public class test {
//    String
public static void main(String[] args) {
//    String str="aa";
//    str="bb";
//    int str=1;
//    str=2;
//    System.out.println(str);
    String str="aa";
    String str2="aa";
    String str4="aaaa";
//    String str3=(str+str2).intern();
    String str3=str+str2;
    System.out.println(str==str2);
    str="bb";
    System.out.println(str==str2);
    System.out.println(str3==str4);
}
}