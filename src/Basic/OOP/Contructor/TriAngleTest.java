package Basic.OOP.Contructor;

import java.sql.SQLOutput;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 14:04
 * \
 */
public class TriAngleTest {

    public static void main(String[] args) {
        TriAngle triAngle=new TriAngle( 2,3 );
        System.out.println(triAngle.getArea());
    }
}