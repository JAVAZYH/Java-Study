package Basic.OOP.Object;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/4
 * \* Time: 10:11
 * \
 */
public class hashCodeTest {


    public static void main(String[] args) {
        Demo d=new Demo();
        d.setId( 1 );
        Demo d2=new Demo();
        d2.setId( 1 );
        System.out.println(d.equals( d2 ));
        System.out.println(d.hashCode());
        System.out.println(d2.hashCode());

    }
}
class Demo {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

}