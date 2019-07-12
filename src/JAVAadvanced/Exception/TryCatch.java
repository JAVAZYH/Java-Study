package JAVAadvanced.Exception;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 15:39
 * \
 */
public class TryCatch {
    public  void test(){
        try{
            int[] numbers=new int[2];
            System.out.println(numbers[2]);
        }catch(Exception e){
            System.out.println("抓住了");
        }finally {
            System.out.println("一定会执行");
        }
        System.out.println("最后");
    }

    public static void main(String[] args) {
        TryCatch tc=new TryCatch();
        tc.test();
    }
}