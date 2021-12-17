package zyh.JAVAadvanced.Abstract;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 14:22 2021/12/14
 * @ Description：
 */
public class MongoService extends BasicService{


    protected MongoService(String tableEnv) {
        super( tableEnv );
    }

    @Override
    public void createDP(String dp) {
        System.out.println( "MongoService"+dp );
    }
}