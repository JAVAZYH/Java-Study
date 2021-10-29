package zyh.JAVABasic.OOP.inheritance;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 8:55
 * \
 */
public class Kids  extends ManKind{
    private int yearsOld;
    public  void printAge(){
        System.out.println(this.yearsOld);
    }
    @Override
    public void employeed(int aa) {
        System.out.println("kids should study and no job");
    }

}