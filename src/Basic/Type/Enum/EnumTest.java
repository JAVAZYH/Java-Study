package Basic.Type.Enum;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 14:58
 * \
 */
public class EnumTest {
    enum size{
        big,
        mid,
        small
    }

    public static void main(String[] args) {
        size s=size.mid;
        System.out.println(s);
    }
}