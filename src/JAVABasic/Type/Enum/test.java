package JAVABasic.Type.Enum;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 10:23
 * \
 */
public class test {
    public static void main(String[] args) {

    }
}
//自定义枚举类
class Season{
    //1.私有化构造器
    public Season(String SEASSONNAME, String SEASONDES) {
        this.SEASSONNAME = SEASSONNAME;
        this.SEASONDES = SEASONDES;
    }
    private final String SEASSONNAME;

    public String getSEASSONNAME() {
        return SEASSONNAME;
    }

    public String getSEASONDES() {
        return SEASONDES;
    }

    private final String SEASONDES;
    //创建本类的对象
    public static  final Season SPRING=new Season("春天","春");
    public static  final Season SUMMER=new Season("夏天","夏");
    public static  final Season AUTUMN=new Season("秋天","秋");
    public static  final Season WINTER=new Season("冬天","冬");

}