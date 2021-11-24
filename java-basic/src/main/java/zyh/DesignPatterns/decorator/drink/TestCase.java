package zyh.DesignPatterns.decorator.drink;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:28 2021/11/24
 * @ Description：
 * 背景：为了解决使用继承导致子类膨胀的问题
 * 总结：
 * 1.装饰者模式是动态的把职责添加到对象上，就像动态的把糖加到水或茶上
 * 2.装饰者模式的被装饰者和装饰者可以独立的发展，就像水和糖独立发展
 * 3.装饰者模式希望多用组合，少用继承
 * 使用场景：
 *  1.扩展一个类的功能 2.动态的对一个类增加功能和撤销功能
 *  参考：
 *  https://www.cnblogs.com/of-fanruice/p/11565679.html
 *  https://www.cnblogs.com/youzoulalala/p/11046607.html（有点歧义）
 */
public class TestCase {
    public static void main(String[] args) {
        //来一杯啥也不加的水
        BaseDrink water = new Water();
        System.out.println( water.description+water.cost());

        //来一杯加了冰的水
        BaseDrink water2 = new Water();
         water2 = new IceDecorator( water2 );
        System.out.println( water2.getDescription() + water2.cost() );

        //来一杯加了冰和糖的茶
        BaseDrink tea = new Tea();
        tea = new SugarDecorator( tea );
        tea = new IceDecorator( tea );
        System.out.println( tea.getDescription() + tea.cost() );

    }
}