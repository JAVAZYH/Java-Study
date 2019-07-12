package DesignPatterns.CreationalPattern.FactoryPattern.AbstractFactory;
//抽象工厂
public interface CarFactory {
    //生产卡车
    public Trunk produceTrunk();
    //生产轿车
    public  Sedan produceSedan();
}
