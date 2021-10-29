package zyh.JAVAadvanced.API.string.practice;


import org.junit.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/8
 * \* Time: 18:28
 * \
 */
public class test {
//    @Test
//    public  void FileTest(){
//         String str="hello";
//         String str2="a";
//         String str3="hello"+"a";//直接去常量池中查找hello+a的内容的地址值，找到了str5
//         String str4=str+str2;
//         String str5="helloa";
//        System.out.println(str3==str4);//false,如果有变量参与则会new新的str对象
//        System.out.println(str3==str5);//true
//    }
//    //创建string对象
//    @Test
//    public  void test2(){
//       String str="a";
//       String str2="a";
//        String str3 = new String("b");
//        String str4 = new String( "b" );
//        System.out.println(str==str2);//true 同一对象
//        System.out.println(str3==str4);//false 不同对象
//
//    }
    @Test
    public  void test(){
//      char[] charArray="abcdefg".toCharArray();
//////      String str=new String( charArray,0,2 );//从字符数组中截取字符串，包头不包尾
//////         System.out.println(str);
////
////         byte[] bytes="abcd".getBytes();
////        System.out.println( Arrays.toString(bytes) );//[97, 98, 99, 100],字节数组中存储ASCII码，将字符串转为字节数组
////        String str2=new String( bytes );
////        System.out.println(str2);

//        String str="a-b-c-d-e";
//        String[] strings=str.split( "-" );//根据符号分隔字符串并且返回一个字符串的数组
//        System.out.println( Arrays.toString( strings ) );

//        String str="AaAaAa";
//        System.out.println(str.replace( 'A','a' ));//替换字符串中的单个字符
//        System.out.println(str.replaceAll( "Aa","1" ));//替换字符串中的字符串
//        System.out.println(str.replaceFirst( "Aa" ,"1"));//替换字符串中的第一个
//
//
//         String str="abcdefg";
//        System.out.println(str.endsWith( "g" ));//判断字符串是否以suffix收尾
//        System.out.println(str.startsWith( "a",4));//判断字符串开头
//        System.out.println(str.contains( "bc" ));//字符串中是否包含
//
//             String str="abcd";
//        System.out.println(str.indexOf( "c" ));//获取字符串第一次出现的位置
//        System.out.println(str.indexOf( "a",3 ));//获取字符串从某个位置开始出现的位置
//        System.out.println(str.lastIndexOf( "a" ));//从后往前查看字符串第一次出现的位置
//        System.out.println(str.lastIndexOf( "a",2 ));//从指定位置从后往前查看字符串出现的位置


//        System.out.println("      a b ".trim());//去除字符串两端的空格
//        System.out.println("a".equalsIgnoreCase( "A" ));//忽略大小写比较两端字符串的内容
//        System.out.println("aa".concat( "bb" ));//字符串拼接


    }


    /**
     * 思路：用两个数组，设置if判断,大小写之间相差32个ASCII码
     */
    @Test
    public  void test2(){
        //1.将字符串中的内容转小写
//        String str="AAAAaaaaBBBBBbbbZz";
//        String newStr="";
//        for(int i=0;i<str.length();i++){
//            char c=str.charAt( i );
//            if (c>='A'&& c<='Z'){
//               c=(char)(c+32);
//            }
//            //字符串拼接
//            newStr+=c;
//        }
//        System.out.println(newStr);

        //2.小写转大写
//        for(int i=0;i<str.length();i++){
//            char c=str.charAt( i );
//            if (c>='a'&&c<='z'){
//                c= (char) (c-32);
//            }
//            newStr+=c;
//        }
//        System.out.println(newStr);

        //大写转小写，小写转大写
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt( i );
//            if (c>='a'&&c<='z'){
//                c= (char) (c-32);
//            }else if (c>='A'&c<='Z'){
//                c= (char) (c+32);
//            }
//            newStr+=c;
//        }
//        System.out.println(newStr);


    }
    // 4.统计字符串中"abcdefabcddabc"abc出现的次数

    /**
     * 思路：使用indexof获取第一次出现的位置，然后自增3开始查找第二次。。。
     * 使用while循环来判断
     */
//    @Test
//    public  void tes3(){
//         String str="abcdefabcddabc";
//         String findStr="abc";
//         int count=0;
//         int index=0;
//         while ((index=str.indexOf( findStr,index))!=-1){
//             count++;
//             index+=findStr.length();
//         }
//        System.out.println(count);
//    }


   //1.模拟一个trim方法，去除字符串两端的空格。

    /**
     * 采用i和j头尾双指针进行去除
     * 采用m和n记录不出现空字符的下标，由于数组截取是包头不包尾n为1
     * 然后截取字符串
     */
    @Test
    public  void test3(){
        String str="    a   b    c    ";
        int m=0,n=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt( i );
            if (c!=' '){
              m=str.indexOf( c );
               for(int j=str.length()-1;j>0;j--){
                   c=str.charAt( j );
                   if (c!=' '){
                        n=str.indexOf( c );
                       break;
                   }
               }
              break;
            }
        }
        System.out.println(str.substring( m,n+1 ));
    }

    //2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”,"cdef"
    /**
     * 获取需要反转的字符串在主字符串中的位置，然后反转字符串，替换掉主字符串中的位置
     */
    @Test
    public  void test4(){
         String str="abcdefg";
         String revStr="cdef";
         String newStr="";
         int index=str.indexOf( revStr,0 );
//         char[] charArray=revStr.toCharArray();
//         for(int i=0,j=charArray.length-1-i;i<charArray.length/2;i++,j--){
//             char tmp=charArray[i];
//             charArray[i]=charArray[j];
//             charArray[j]=tmp;
//         }
//          for(int i=0,j=revStr.length()-1-i;i<revStr.length()/2;i++,j--){
//              char tmp=revStr.charAt( i );
//              revStr.charAt( i )=(char) 'c';
//         }
        for(int i=revStr.length()-1;i>=0;i--){
            newStr+=revStr.charAt( i );
        }
         str=str.replaceAll( revStr,newStr );
        System.out.println( str);
    }


    //   4.获取两个字符串中最大相同子串。比如：
    //   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
    //   提示：将短的那个串进行长度依次递减的子串与较长
    //   的串比较。
    @Test
    public  void test5(){
       String str1 = "abcwerthelloyuiodefdefdef",str2 = "cvhellobnmdefdefdef";
       String tmp="";
       for(int i=0;i<str2.length();i++){
           for(int j=0;j<=i;j++){
               String subString=str2.substring( j,str2.length()-i+j );
               if (str1.contains( subString )){
                   tmp=subString;
                   System.out.println(subString);
                   return;
               }
           }
       }
        System.out.println(tmp);

//        System.out.println(getSonString( str1,str2 ));


    }
        private static String getSonString(String a, String b) {
            String max=null;
            String min=null;
            String temp="";
            if (a.length()>b.length()) {
                max=a;
                min=b;
            }else {
                max=b;
                min=a;
            }
            for (int i = 0; i <min.length(); i++) {
                for (int j = 0; j <=i; j++) {
                   int m=min.length();
                    int n=min.length()-i+j;
                    String substring = min.substring(j, min.length()-i+j);
                    System.out.println(substring);//从小的字符串开始，从左向右移位比较
                    if (max.contains(substring)) {
//                        if(temp.length()<substring.length()) {
//                            temp=substring;
//                        }
                        return substring;
                    }
                }

            }

            return temp;
        }



    //5.对字符串中字符进行自然顺序排序。
    //提示：
    //1）字符串变成字符数组。
    //2）对数组排序，选择，冒泡，Arrays.sort();
    //3）将排序后的数组变成字符串。
}