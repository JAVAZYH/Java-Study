package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:34 2021/11/24
 * @ Description： 装饰者类-冰
 */
public class IceDecorator extends DrinkDecorator{

    BaseDrink baseDrink;

    public IceDecorator(BaseDrink baseDrink) {
        this.baseDrink = baseDrink;
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription()+"加了点冰";
    }

    @Override
    public int cost() {
        return baseDrink.cost()+100;
    }
}