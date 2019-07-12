package Basic.OOP.KeyWord.AbstractTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/3
 * \* Time: 10:24
 * \
 */

/**
 * 抽象方法所在的类必须为抽象类
 */
abstract class Math{
    public abstract void study();
}
 abstract class GeometricObject extends Math{//几何图形
    public  abstract double findArea();//抽象方法没有方法体

}
class Circle extends GeometricObject{

    @Override
    public double findArea() {
        return 0;
    }

    @Override
    public void study() {

    }
}