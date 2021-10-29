package zyh.JAVAadvanced.API.string;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/8
 * \* Time: 15:18
 * \
 */
public class exar {
    //1，字符串内容转小写
    public static void toLower(String str){
        char[] chars=str.toCharArray();
      for(int i=0;i<chars.length;i++){
          char c=chars[i];
          if (c>='A'&& c<='Z'){
//              char c2=;
//             c=(char) (c+32);
              chars[i]=(char) (c+32);
//             c=(char) (c+32);
//             str.charAt( i )=c;
//             str.replace( c,c2 );
//              System.out.println(c);
          }
      }
        System.out.println(chars);
    }
    //2.字符串内容小写转大写
    //3.将字符串中的内容大写转小写，小写转大写
    //4.替换部分内容

    public static void main(String[] args) {
        String str="aaaAAA";
        toLower( str );
        System.out.println();
    }
}
