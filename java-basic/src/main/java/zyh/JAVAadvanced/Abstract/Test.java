package zyh.JAVAadvanced.Abstract;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 11:28 2021/12/14
 * @ Description：
 */
public class Test {
    public static void main(String[] args) {
        String env="env" ;
        KafkaService kafkaService = new KafkaService(env);
        kafkaService.createDP("kafkadp");
        new MongoService(env).createDP( "mongodb" );
//        kafkaService.hello();
    }
}