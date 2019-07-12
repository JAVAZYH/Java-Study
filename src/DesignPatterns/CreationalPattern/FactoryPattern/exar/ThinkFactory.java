package DesignPatterns.CreationalPattern.FactoryPattern.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:51
 * \
 */
public class ThinkFactory  implements ElecFactory{
    @Override
    public Phone producePhone() {
        return new ThinkPhone();
    }

    @Override
    public Displayer produceDisplayer() {
        return new ThinkDiplayer();
    }
}