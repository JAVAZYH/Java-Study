package DesignPatterns.CreationalPattern.FactoryPattern.SimpleFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 19:04
 * \
 */
public class BmwTrunk  implements Trunk{
    @Override
    public void run() {
        System.out.println("宝马卡车启动");
    }
}