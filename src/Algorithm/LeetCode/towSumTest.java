package Algorithm.LeetCode;

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
}