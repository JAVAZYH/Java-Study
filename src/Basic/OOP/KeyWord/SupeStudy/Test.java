package Basic.OOP.KeyWord.SupeStudy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 10:27
 * \
 */
public class Test {
    Test(){
        System.out.println("i am test constructor");
    }
    Test(String a){
        System.out.println(a);
    }
    void info(){
        System.out.println("i am test");
    }
    void SuperInfo(){
        System.out.println("test.superInfo");
    }
}