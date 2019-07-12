package Basic.Type.Enum;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 14:58
 * \
 */
public class EnumTest {
//    enum size{
//        big,
//        mid,
//        small
//    }
//
//    public static void main(String[] args) {
//        size s=size.mid;
//        System.out.println(s);
//    }
public static void main(String[] args) {
//switch(Season2.SPRING){
//    case SUMMER:
//        System.out.println("夏天");
//        break;
//    case WINTER:
//        System.out.println("冬天");
//        break;
//    case AUTUMN:
//        System.out.println("秋天");
//        break;
//    case SPRING:
//        System.out.println("春天");
//        break;
//
//}

   Season2[] arr= Season2.values();
    System.out.println( Arrays.toString( arr ) );
    Season2 season2=Season2.valueOf( "SPRING" );
    System.out.println(season2.getName());

//   Season2.SPRING.info();
}
}
enum Season2{
    SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    Season2(String name){
        this.name=name;
    }
}

//实现接口的枚举类
//interface Description{
//    void info();
//}
//enum Season2 implements Description{
//    SPRING("春"){
//        @Override
//        public void info() {
//            System.out.println("春天info");
//        }
//    },
//    SUMMER("夏"){
//        @Override
//        public void info() {
//            System.out.println("夏天info");
//        }
//    },
//    AUTUMN("秋"),
//    WINTER("冬");
//
//
//
//    String name;
//    Season2(String name){
//        this.name=name;
//    }
//
//    @Override
//    public void info() {
//        System.out.println("info");
//    }
//
//}
