package zyh.DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:22
 * \
 */
public class Customer {
    public static void main(String[] args) {
        CarFactory bm=new BmwFactory();
        bm.produceSedan().run();
        bm.produceTrunk().run();

        CarFactory audi=new AudiFactory();
        audi.produceTrunk().run();
        audi.produceSedan().run();
    }
}