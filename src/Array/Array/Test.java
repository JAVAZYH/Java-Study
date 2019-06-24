package Array.Array;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/22
 * \* Time: 14:17
 * \
 */
public class Test {
    public static void main(String[] args) {
     Test test=new Test();
//     test.test01();
//        test.test02();
//        test.test03();
//        test.test04();
//        test.test06();
    }

    /**
     * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
     * 使用for循环访问所有元素并打印出来。
     * 提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> ‘1‘
     */
    void test01(){
        char[] chars=new char[26];
        char c='A';
        for (int i=0;i<chars.length;i++){
            chars[i]=c;
            c++;
        }
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
    }

    /**
     *创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,后10个元素放置'0'-'9‘。
     * 使用for循环访问所有元素并打印出来。
     */
    public  void test02(){
        char[] chars=new char[36];
        char c='A';
        char b='0';
        for (int i=0;i<chars.length;i++) {
            if (i < 26) {
                chars[i] =c;
                c++;
            } else
            {
                chars[i]=b;
                 b++;
            }
        }
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
    }

    /**
     * 输入五名同学成绩，求出总成绩和平均成绩
     */
    public void  test03(){
        int[] ins=new int[5];
        int sum=0;
        for (int i=0;i<ins.length;i++){
            Scanner scanner=new Scanner( System.in );
            ins[i]=scanner.nextInt();
            sum+=ins[i];
        }
        System.out.println("sum"+sum+"average"+sum/ins.length);
    }

    /**
     * 小明要去买一部手机，他询问了4家店的价格，分别是2800.5元，2900元，2750.0元和3100元，显示输出最低价
     */
    public void test04(){
        double[] floats={2800.5,2900,2750.0,3100};
        double start=floats[0];
        for (int i=0;i<floats.length;i++){
          if (floats[i]<start){
              start=floats[i];
          }
      }
        System.out.println(start);
    }


    /**
     * 随机产生10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有
     */
    public  void test05(){
        int[] ints=new int[10];
        for (int i=0;i<ints.length;i++){
            double random=Math.random();
            ints[i]=(int)(random*90+10);
            if (ints[i]>80){
                System.out.println("有大于80的数："+ints[i]);
            }
        }
//        for (int i=0;i<ints.length;i++){
//            System.out.println(ints[i]);
//        }
    }

    /**
     * 反转数组
     */
    public void test06(){
        int[] array={1,2,3,4,20};
        int temp;
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i=0,j=array.length-1-i;i<array.length/2;i++,j--){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println("---翻转后----");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }


}