package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:26 2021/11/24
 * @ Description：装饰者类-糖
 */
public class SugarDecorator extends DrinkDecorator{

    BaseDrink baseDrink;

    public SugarDecorator(BaseDrink baseDrink) {
        this.baseDrink = baseDrink;
    }

    @Override
    public String getDescription() {
        return baseDrink.getDescription()+"加了点糖";
    }

    @Override
    public int cost() {
        return baseDrink.cost()+100;
    }
}