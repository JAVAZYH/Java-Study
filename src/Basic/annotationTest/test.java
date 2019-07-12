package Basic.annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 11:35
 * \
 */
public class test {

    private String name;
    @Myann()
    public  void test(){
    }
}
@Target(ElementType.METHOD)
@interface Myann{
String name() default "ccc";
}