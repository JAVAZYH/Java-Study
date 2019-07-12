package DesignPatterns.CreationalPattern.FactoryPattern.FactoryMethod;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 20:46
 * \
 */
public class Customer {
    public static void main(String[] args) {
        TrunkFactory bm=new BmwTrunkFactory();
        bm.createTrunk().run();
        TrunkFactory am=new AudiTrunkFactory();
        am.createTrunk().run();
    }
}