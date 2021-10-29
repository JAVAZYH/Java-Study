package zyh.DesignPatterns.CreationalPattern.FactoryPattern.SimpleFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 19:07
 * \
 */
public class TrunkFactory {
    public  static Trunk createTrunk(String message){
        switch (message){
            case "宝马":
                return new BmwTrunk();
            case "奥迪":
                return  new AudiTrunk();
            default:
                return null;
        }
    }
}