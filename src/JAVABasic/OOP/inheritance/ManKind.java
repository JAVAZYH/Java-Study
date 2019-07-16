package JAVABasic.OOP.inheritance;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 8:53
 * \
 */
public class ManKind {
   int sex;
     int salary;
    public  void manOrWoman(int sex){
        if (sex==1){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }
    public  void employeed(int salary){
        if (salary==0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}