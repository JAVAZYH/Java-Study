package zyh.JAVAadvanced.Abstract;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 11:24 2021/12/14
 * @ Description：
 */
public class KafkaService extends BasicService{
    protected KafkaService(String tableEnv) {
        super( tableEnv );
    }

    @Override
    public void createDP(String dp) {
        System.out.println( "KafkaService"+dp );
    }

}
