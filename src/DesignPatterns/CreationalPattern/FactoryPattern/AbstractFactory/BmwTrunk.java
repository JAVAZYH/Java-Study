package DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:16
 * \
 */
public class BmwTrunk implements Trunk {
    @Override
    public void run() {
        System.out.println("宝马卡车启动");
    }
}