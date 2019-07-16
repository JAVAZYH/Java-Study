package JAVABasic.Practice;

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
//           FileTest();
//    }
//    public static void FileTest(){
//        int a;
//    }

//    public boolean isTest() {
//        return FileTest;
//    }
//
//    public void setTest(boolean FileTest) {
//        this.FileTest = FileTest;
//    }
//
//    private boolean FileTest;
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