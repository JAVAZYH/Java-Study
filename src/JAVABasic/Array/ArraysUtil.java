package JAVABasic.Array;

import java.util.Arrays;

/**
 * array工具类的使用
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 11:11
 * \
 */
public class ArraysUtil {
    public static void main(String[] args) {
        int[]numbers={4,81,1,5,8};
        int[]numbers2={4,80,1,1,8};
        //判断两个数组是否相等,返回布尔类型
        System.out.println(Arrays.equals( numbers,numbers2 ));
        //输出数组信息
        System.out.println(Arrays.toString( numbers ));
        //对数组进行排序
        Arrays.sort( numbers);
        System.out.println(Arrays.toString( numbers));
        //使用二分法查找,查找之前需要进行培训，否则会报错
        System.out.println(Arrays.binarySearch( numbers,81) );
    }

}