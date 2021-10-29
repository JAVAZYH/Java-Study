package zyh.Algorithm;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 9:16
 * \
 */
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(new LinearSearch().test( arr,5 ));
    }
    //线性查找
    public int test(int arr[],int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}