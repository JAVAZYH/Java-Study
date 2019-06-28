package Basic.OOP.Overload;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 14:37
 * \
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test=new OverloadTest();
        test.mOL( 2 );
        test.mOL( 2,3 );
        test.mOL( "111" );
        test.max( 10,50 );
        test.max( 10.2,10.6 );
        test.max( 10.1,1.0,35.5 );
    }
    public void mOL(int a){
        System.out.println(a*a);
    }
    public void mOL(int a,int b){
        System.out.println(a*b);
    }
    public void mOL(String str){
        System.out.println(str);
    }
    public int max(int a,int b){
        return a>b?a:b;
    }
    public double max(double a,double b){
        return a>b?a:b;
    }
    public double max(double a,double b,double c ){
        //利用max求出两个值中的最大值
        double maxNumber=max( a,b );
        return max( maxNumber,c );
    }
}