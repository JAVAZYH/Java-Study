package Algorithm;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 10:27
 * \
 */

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 二分查找
 */
public class binarySearch {
    /**
     * 二分查找算法
     *
     * @param args
     * @return key的数组下标，没找到返回-1
     */
    public static void main(String[] args) {
        binarySearch bs=new binarySearch();
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
//        System.out.println( binSearch( srcArray, 0, srcArray.length - 1, 81 ) );
//        System.out.println(bs.FileTest(srcArray,50));
//        System.out.println(bs.binSearch( srcArray,50 ));
//        bs.FileTest();
        System.out.println(bs.test03( srcArray,50 ));

    }

    // 二分查找递归实现
    public static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch( srcArray, mid + 1, end, key );
        } else if (key < srcArray[mid]) {
            return binSearch( srcArray, start, mid - 1, key );
        }
        return -1;
    }

    // 二分查找普通循环实现
    public static int binSearch(int srcArray[], int key) {
        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
@Test
    //二分查找自己实现
    public void test() {
    int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
    int key=50;
        int low = 0;
        int high = srcArray.length - 1;
        int mid;
        while (low<=high){
            mid=(high-low)/2+low;
        if (key == srcArray[mid]) {
            System.out.println(mid);
            break;
        } else if (key > srcArray[mid]) {
            low = mid + 1;
        } else if (key < srcArray[mid]) {
            high = mid - 1;
        } else {
            System.out.println(-1);
        }
        }
    }
    //优化
    public int test03(int[] srcArray,int key){
//        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
////        int key=50;
        int low=0;
        int high=srcArray.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            //>>>1
            int midVal=srcArray[mid];
            if (key>midVal)
                low=mid+1;
            else if (key<midVal)
                high=mid-1;
            else
                return mid;
        }
        return -(low+1);
    }

    @Test
    //二分查找老师实现
    public void test1(){
        //二分法查找：要求此数组必须是有序的。
        int[] arr3 = new int[]{3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};;
        boolean isFlag = true;
        int number = 50;
//int number = 25;
        int head = 0;//首索引位置
        int end = arr3.length - 1;//尾索引位置
        while(head <= end){
            int middle = (head + end) / 2;
            if(arr3[middle] == number){
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            }else if(arr3[middle] > number){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }

        if(isFlag){
            System.out.println("未找打指定的元素");
        }

    }

    /**
     * 二分查找java源码
     */
    // Like public version, but without range checks.
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}