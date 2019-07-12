package DesignPatterns.CreationalPattern.FactoryPattern.FactoryMethod;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 20:45
 * \
 */
public class AudiTrunkFactory  implements  TrunkFactory{
    @Override
    public Trunk createTrunk() {
        return new AudiTrunk();
    }
}