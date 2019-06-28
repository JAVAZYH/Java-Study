package Basic.OOP.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 18:46
 * \
 */
public class Circle {
    /**
     * 利用面向对象的编程方法，设计类Circle计算圆的面积
     */
    //不需要传参的方法
//    private Double pai=3.14;//Math.PI
//    public Double Calculate(int r){
//     return pai*(r*r);
//    }
    double radius;
    public  double Calculate(){
        return Math.PI*radius*radius;
    }
}