package Algorithm.LeetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: javazyh
 * \* Date: 2019/5/20
 * \* Time: 14:00
 * \https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/#comment
 */

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class towSumTest {
    public static void main(String[] args) {
        System.out.println( Arrays.toString( twoSum( new int[]{2,7,11,15},9 )));
    }
//        public static int[] twoSum(int[] nums, int target) {
//            for(int i=0;i<nums.length;i++){
//                for (int j=i+1;j<nums.length;j++){
//                    if(nums[i]+nums[j]==target){
//                        return new int[]{i,j};
//                    }
//                }
//            }
//            throw new IllegalArgumentException("No two sum solution");
//    }

     public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
    }


//暴力求解  On^2
     @Test
    public  void MyTest(){
         int[] nums={2,3,7,5,6,4,1,1,2};
         int target=4;
         for(int i=0;i<nums.length;i++){
               for(int j=i+1;j<nums.length;j++){
                   if (nums[i]+nums[j]==target){
                       System.out.println(i+","+j);
                       return;
                   }
               }
         }
         throw new IllegalArgumentException( "no find" );
    }


    //使用hashmap On
    @Test
    public  void test(){
        int[] nums={2,3,7,5,6,4,1,1,2};
        int target=4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put( nums[i],i );
        }
        for(int j=0;j<nums.length;j++){
            int complement=target-nums[j];
            if (map.containsKey( complement )&& map.get( complement )!=j){
                System.out.println(Arrays.toString(new int[]{j,map.get( complement )}  ));
                return;
            }
        }

    }

    //一遍哈希表
    @Test
    public  void test2(){
        int[] nums={2,3,7,5,6,4,1,1,2};
        int target=4;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if (m.containsKey( complement )) {
                System.out.println(m.get( complement )+","+i);
            return;
            }
            m.put( nums[i],i );
            }
        }


}