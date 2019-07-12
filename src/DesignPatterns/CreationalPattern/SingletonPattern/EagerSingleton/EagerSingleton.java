package DesignPatterns.CreationalPattern.SingletonPattern.EagerSingleton;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 20:16
 * \
 */

/**
 * 1.单例只能有一个实例。 限定构造方法为private
 * 2.单例必须创建自己的唯一实例
 * 3.单例类必须给其他对象提供这一实例
 *
 */
public class EagerSingleton {
    //私有构造
    private EagerSingleton(){

    }
    private static EagerSingleton singleton=new EagerSingleton();
    //静态工厂方法
    public EagerSingleton getInstance(){
        return singleton;
    }
}