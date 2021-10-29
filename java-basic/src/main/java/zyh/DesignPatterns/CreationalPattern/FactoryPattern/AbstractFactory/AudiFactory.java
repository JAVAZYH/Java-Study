package zyh.DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:21
 * \
 */
public class AudiFactory implements CarFactory{

    @Override
    public Trunk produceTrunk() {
        return new AudiTrunk();
    }

    @Override
    public Sedan produceSedan() {
        return new AudiSedan();
    }
}