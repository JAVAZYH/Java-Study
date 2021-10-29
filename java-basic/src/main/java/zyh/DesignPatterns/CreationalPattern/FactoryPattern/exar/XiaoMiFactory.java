package zyh.DesignPatterns.CreationalPattern.FactoryPattern.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 19:49
 * \
 */
public class XiaoMiFactory implements ElecFactory{
    @Override
    public Phone producePhone() {

        return new XiaoMiPhone();
    }

    @Override
    public Displayer produceDisplayer() {

        return new XiaoMiDisplayer();
    }
}