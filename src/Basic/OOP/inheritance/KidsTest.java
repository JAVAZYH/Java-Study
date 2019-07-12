package Basic.OOP.inheritance;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 8:56
 * \
 */
public class KidsTest {


    public static void main(String[] args) {
        Kids kids=new Kids();
        kids.salary=10;
       kids.employeed( kids.salary );
    }
}