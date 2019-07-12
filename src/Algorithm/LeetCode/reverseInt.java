package Algorithm.LeetCode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/9
 * \* Time: 18:16
 * \
 */

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class reverseInt {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new reverseInt().test( 1463847412 ));
    }

//        public int reverse(int x) {
//         Integer integer=new Integer( x );
//         byte[] bytes=
//        }
public int reverse(int x) {
    int ans = 0;
    while (x != 0) {
        int pop = x % 10;
        x/=10;
        if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
            return 0;
        if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
            return 0;
        ans = ans * 10 + pop;

    }
    return ans;
}

//反转整数
public  int test(int x){
     int ans=0;
     while (x!=0){
         int pop=x%10;
         if (ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10 && pop>7))return 0;
         if (ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10 && pop<-8))return 0;
         x/=10;
         ans=ans*10+pop;
     }
     return ans;
}


}
