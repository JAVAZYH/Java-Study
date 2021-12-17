package zyh.DesignPatterns.bulider.test;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 10:55 2021/12/10
 * @ Description：构建者
 */
public interface Builder<T> {
     void buildA();
     void buildB();
     void buildC();
     T build();
}