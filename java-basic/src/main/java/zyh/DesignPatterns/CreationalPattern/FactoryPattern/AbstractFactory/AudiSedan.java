package zyh.DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:17
 * \
 */
public class AudiSedan implements Sedan{
    @Override
    public void run() {
        System.out.println("奥迪轿车启动");
    }
}