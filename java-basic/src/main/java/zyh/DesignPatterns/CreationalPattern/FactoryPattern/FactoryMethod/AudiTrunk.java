package zyh.DesignPatterns.CreationalPattern.FactoryPattern.FactoryMethod;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 19:05
 * \
 */
public class AudiTrunk  implements Trunk {
    @Override
    public void run() {
        System.out.println("奥迪卡车启动");
    }
}