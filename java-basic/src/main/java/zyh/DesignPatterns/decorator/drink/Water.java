package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:22 2021/11/24
 * @ Description： 被装饰者-水
 */
public class Water extends BaseDrink{


    public Water(){
        description="我是水啊";
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int cost() {
        return 10;
    }
}