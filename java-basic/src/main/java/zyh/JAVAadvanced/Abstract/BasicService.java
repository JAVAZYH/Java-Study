package zyh.JAVAadvanced.Abstract;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 11:14 2021/12/14
 * @ Description：
 */
public abstract class BasicService {

    //如果new两个子类实现对象，父类中的属性是否会被new两次呢
    public final String tableEnv;

    protected BasicService(String tableEnv) {

        this.tableEnv = tableEnv;
    }

    public void createDP(String dp){
        System.out.println( tableEnv );
        System.out.println( dp );
    }


    public void hello(){
        System.out.println( "hello" );
    }


}