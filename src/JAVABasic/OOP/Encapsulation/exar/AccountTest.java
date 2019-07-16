package JAVABasic.OOP.Encapsulation.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 16:54
 * \
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account();
//        account.setBalance( 100 );
        double money=account.deposit( 200.3 );
        System.out.println(account.getBalance());
//        System.out.println(money);
        account.withdraw( 100.5 );
        System.out.println(account.getBalance());
    }
}