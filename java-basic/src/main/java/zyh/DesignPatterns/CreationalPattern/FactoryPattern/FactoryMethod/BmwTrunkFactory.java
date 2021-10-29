package zyh.DesignPatterns.CreationalPattern.FactoryPattern.FactoryMethod;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 20:44
 * \
 */
public class BmwTrunkFactory implements TrunkFactory{
    @Override
    public Trunk createTrunk() {
        return  new BmwTrunk();
    }
}