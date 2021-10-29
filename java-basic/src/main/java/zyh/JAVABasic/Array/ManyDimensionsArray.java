package zyh.JAVABasic.Array;

import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 9:47
 * \
 */
public class ManyDimensionsArray {
    public static void main(String[] args) {
//        test01();
//        test02();
//        test03();
//        int []arr=new int[1];
//        System.out.println(arr[1]);
        char a[]={'A','B','C','D','F'};
        int i=0;
        while (a[i++]!='\0'){
            System.out.println(a[i++]);
            if (i==4){
                break;
            }
        }
//        int i=1;
//        System.out.println(i++*10);

    }

@Test
public static void test01(){
    //1.二维数组的声明和初始化
    //static initialize
    int[][] numbers={{1,111},{2,222},{3,333}};
    String[][] string=new String[][]{{"1","first"},{"2","second"},{"3","three"}};
    //dynamic initialize
    int numbers1[][]=new int[4][3];
    //4指的是4二位数组的长度，3指的二维数组中的元素的元素的个数

    //2.二维数组的赋值
//    String [][] persons=new String[3][2];
//    persons[0][1]="1";
    //2.二维数组的赋值
    String [][] persons=new String[3][2];
    persons[0][1]="1231456";
    System.out.println("length:"+persons[0].length);
    System.out.println(persons[0][1].length());

    //3.获取二维数组元素的值

    //4.遍历二维数组
     for(int i=0;i<string.length;i++){
         for(int j=0;j<string[i].length;j++){
             System.out.println(string[i][j]);
         }
     }
}

/**
 * 获取arr数组中所有元素的和。
 *
 * 提示：使用for的嵌套循环即可。
 */
@Test
  public static void test02(){
      int[][] numbers={{1,10},{2,20},{3,30},{4,2}};
      int sum=0;
      //遍历二维数组元素
      for(int i=0;i<numbers.length;i++){
          //遍历二维数组中一维数组的元素
          for(int j=0;j<numbers[i].length;j++){
              sum+=numbers[i][j];
          }
      }
    System.out.println(sum);
  }

    /**
     * 声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
     * a )   x[0] = y;
     *
     * b)    y[0] = x;
     *
     * c)    y[0][0] = x;
     *
     * d)    x[0][0] = y;
     *
     * e)    y[0][0] = x[0];
     *
     * f)    x = y;
     * b,e
     * x是一维数组，y是二维数组
     */

    /**
     * 使用二维数组打印一个 10 行杨辉三角。
     *
     * 【提示】
     *  1. 第一行有 1 个元素, 第 n 行有 n 个元素
     *  2. 每一行的第一个元素和最后一个元素都是 1
     *  3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
     * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     */
    @Test
    public  void test03(){
//        int[][] yanghui=new int[10][];
//        for(int i=0;i<yanghui.length;i++){
//            yanghui[i]=new int[i+1];
//            yanghui[i][0]=yanghui[i][i]=1;
//            //遍历的是一维数组
//            for(int j=1;j<yanghui[i].length-1;j++){
//                yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
//            }
//        }
//        for(int i=0;i<yanghui.length;i++){
//            for(int j=0;j<yanghui[i].length;j++){
//                System.out.print(yanghui[i][j]+" ");
//            }
//            System.out.println();
//        }
        int [][] arr=new int[10][];
        for(int i=0;i<arr.length;i++){
            //构建数组
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}