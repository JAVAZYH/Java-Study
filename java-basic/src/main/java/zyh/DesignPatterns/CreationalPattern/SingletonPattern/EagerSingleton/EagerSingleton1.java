package zyh.DesignPatterns.CreationalPattern.SingletonPattern.EagerSingleton;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 20:20
 * \
 */
public class EagerSingleton1 {
    private  EagerSingleton1(){}
    private static  EagerSingleton1 single=null;
    static {
        single=new EagerSingleton1();
    }
    public static EagerSingleton1 getInstance(){
        return single;
    }

}