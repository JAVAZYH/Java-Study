package DesignPatterns.CreationalPattern.FactoryPattern.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:51
 * \
 */
public class Customer {
    public static void main(String[] args) {
        ElecFactory xiaomi=new XiaoMiFactory();
        xiaomi.produceDisplayer().show();
        xiaomi.producePhone().call();

        ElecFactory think=new ThinkFactory();
        think.produceDisplayer().show();
        think.producePhone().call();

    }
}