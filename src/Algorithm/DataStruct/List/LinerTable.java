package Algorithm.DataStruct.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 19:20
 * \
 */

import java.util.Arrays;

/**
 * 向线性表插入数据
 */
public class LinerTable {
    public static void main(String[] args) {
//        System.out.println(insert());
        System.out.println(delete());
    }

    /**
     * 向线性表插入数据
     * @return
     */
    public static String insert(){
        int[] arrs=new int[10];
        int maxSize=100;
        int insertValue=10;
        int position=0;
        if (arrs.length==maxSize){
            return "线性表已满";
        }
        if (position<0|| position>arrs.length-1){
            return "插入的位置不在范围内";
        }
        if (position<=arrs.length){
            for(int i=position;i<arrs.length-1;i++){
                arrs[i]=arrs[i+1];
            }
        }
        arrs[position]=insertValue;
        //扩容数组
        int[] newArr=new int[arrs.length+1];
        for(int i=0;i<arrs.length;i++){
            newArr[i]=arrs[i];
        }
        System.out.println( Arrays.toString( newArr ) );
        return "ok";
    }

    /**
     * 删除线性表中的元素
     */
    public static  String delete() {
        int[] arr = {1, 2, 10, 4, 5, 8};
        int deleteValue=10;
        int position=getIndex( 10,arr);
        if (arr.length==0){
            return "线性表为空";
        }
        if (position<0||position>arr.length-1){
            return "删除位置错误";
        }


        if (position!=arr.length-1){
            for(int i=position;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
        }
        //减容数组
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<newArr.length;i++){
            newArr[i]=arr[i];
        }
        System.out.println( Arrays.toString( newArr ) );
        return "ok";
    }

    /**
     * 获得数组元素的下标
     */
     public static int getIndex(int value,int[] arr){
         for(int i=0;i<arr.length;i++){
             if (value==arr[i]) {
                 return i;
             }
         }
         return -1;
     }
}