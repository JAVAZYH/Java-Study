package DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:21
 * \
 */
public class BmwFactory implements CarFactory{
    @Override
    public Trunk produceTrunk() {
        return new BmwTrunk();
    }

    @Override
    public Sedan produceSedan() {
        return new BmwSedan();
    }
}