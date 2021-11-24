package zyh.DesignPatterns.decorator.drink;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 21:21 2021/11/24
 * @ Description：基础饮料类
 */
public abstract class BaseDrink {
    String description = "我是基础饮料抽象类";

    public String getDescription(){
        return description;
    }

    /**
     * 饮料花了多少钱
     * @return
     */
    public abstract int cost();


}