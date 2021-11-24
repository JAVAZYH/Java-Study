package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:23 2021/11/24
 * @ Description：被装饰者类-茶
 */
public class Tea extends BaseDrink{
    public Tea() {
        description="我是茶啊";
    }

    @Override
    public int cost() {
        return 20;
    }
}