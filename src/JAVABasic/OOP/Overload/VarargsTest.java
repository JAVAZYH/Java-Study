package JAVABasic.OOP.Overload;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 15:35
 * \
 */
public class VarargsTest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
       add( arr );
    }
    public static void add(int ... numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}