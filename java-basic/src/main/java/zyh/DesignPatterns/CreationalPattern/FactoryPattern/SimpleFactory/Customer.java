package zyh.DesignPatterns.CreationalPattern.FactoryPattern.SimpleFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 19:05
 * \
 */
public class Customer {
    public static void main(String[] args) {
    TrunkFactory.createTrunk( "宝马" ).run();
    }
}