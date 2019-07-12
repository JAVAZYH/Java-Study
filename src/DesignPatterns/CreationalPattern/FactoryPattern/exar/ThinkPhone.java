package DesignPatterns.CreationalPattern.FactoryPattern.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:47
 * \
 */
public class ThinkPhone implements Phone {
    @Override
    public void call() {
        System.out.println("联想手机打电话");
    }
}