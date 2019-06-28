package Basic.OOP.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 19:47
 * \
 */
public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int i, int i1, int i2) {
     year=i;
     month=i1;
     day=i2;
    }

    public void info(){
        System.out.println(year+"--"+month+"--"+ day );
    }
}