package zyh.JAVABasic.OOP.override;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 15:53
 * \
 */
public class ManKind {
  public  void employeed(){
      System.out.println("mankid");
  }

    public static void main(String[] args) {
        new Kids().employeed();
    }
}
class Kids extends ManKind{
    @Override
    public void employeed() {
        System.out.println("kids should study and no job");
    }

}