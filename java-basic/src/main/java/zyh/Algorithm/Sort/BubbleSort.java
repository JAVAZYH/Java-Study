package zyh.Algorithm.Sort;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 9:16
 * \
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,91,5,4,6,10,41,8};
        BubbleSort bubbleSort=new BubbleSort();
        System.out.println(bubbleSort.test( arr ));
    }
//    public String FileTest(int[] arr){
//////        int temp;
//////        for(int i=0;i<arr.length;i++){
//////            for(int j=0;j<i;j++){
//////                System.out.println(arr[i]+","+arr[j]+","+Arrays.toString( arr ));
//////                if (arr[i]<arr[j]){
//////                    temp=arr[i];
//////                    arr[i]=arr[j];
//////                    arr[j]=temp;
//////                }
//////            }
//////        }
//////        return Arrays.toString( arr );
//////    }
public String test(int[] arr){
    int temp;
    //用来控制内层循环的长度
    for(int i=arr.length-1;i>0;i--){
        //内层循环，两两相比，每一次把最大的数冒泡到最前面
        for(int j=0;j<i;j++){
            System.out.println(arr[j]+","+arr[j+1]+","+Arrays.toString( arr ));
            if (arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return Arrays.toString( arr );
}
}