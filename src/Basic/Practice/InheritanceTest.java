package Basic.Practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 21:10
 * \
 */
public class InheritanceTest {
    public static void main(String[] args) {
        String s="a";
        DB db=new DB();
        db.m( s );
        System.out.println(s);

    }
//    public static void main(String[] args) {
//           test();
//    }
//    public static void test(){
//        int a;
//    }

//    public boolean isTest() {
//        return test;
//    }
//
//    public void setTest(boolean test) {
//        this.test = test;
//    }
//
//    private boolean test;
//
//    public Boolean getTest2() {
//        return test2;
//    }
//
//    public void setTest2(Boolean test2) {
//        this.test2 = test2;
//    }
//
//    private Boolean test2;

}
class DB{
    void  m(String s){
        s=new String( "bbb" );
        System.out.println();
    }
}