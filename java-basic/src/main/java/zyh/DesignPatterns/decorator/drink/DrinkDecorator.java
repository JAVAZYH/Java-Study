package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:24 2021/11/24
 * @ Description：抽象装饰者类，主要就是装饰基础饮料
 */
public abstract class DrinkDecorator extends BaseDrink{

    public abstract String getDescription();
}