package JAVAadvanced.API.date;

import org.junit.Test;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/9
 * \* Time: 9:34
 * \
 */
public class test {
    @Test
    public  void test(){
        Date date = new Date();
//        System.out.println(date.getTime());//获取当前时间的毫秒数
//        System.out.println( date.toString() );//输出当前日期
//        java.sql.Date date1 = new java.sql.Date( date.getTime() );
//        System.out.println(date1.toString());//输出当前日期
//        System.out.println(date.getClass().getName());
//        java.util.Date date=new java.util.Date(  );
//        System.out.println(new Date(date.getTime()) );

//        Calendar calendar = Calendar.getInstance();
//        calendar.set( Calendar.DAY_OF_MONTH,10 );
//        System.out.println(calendar.get( Calendar.DAY_OF_MONTH));
//
//        //获取当前时间
//        Date date=calendar.getTime();
//        System.out.println(date.toString());

    }
//    @Test
//    public  void test2(){
////        //以UTC时间为准
////        Instant now = Instant.now();
////        System.out.println(now);
////        System.out.println(Instant.ofEpochMilli(new Date(  ).getTime()  ));
////
//        System.out.println(Math.floor( -12.9));
//        System.out.println(Math.round( -12.5 ));
//    }
//    @Test
//    public  void test3(){
//        BigDecimal a=new BigDecimal( String.valueOf( 1 ) );
//        BigDecimal b = new BigDecimal( String.valueOf( 0.41 ) );
//        System.out.println(a.subtract( b ));
//        System.out.println(1-0.41);
//    }
//    @Test
//    public  void test2(){
//        Date date = new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" );
//        String s = sdf.format( date );
//        System.out.println(s);
//        try {
//            Date date1=sdf.parse(s);
//            System.out.println(date1);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//

}