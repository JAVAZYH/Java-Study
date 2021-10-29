package zyh.DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:17
 * \
 */
public class AudiTrunk implements Trunk {
    @Override
    public void run() {
        System.out.println("奥迪卡车启动");
    }
}