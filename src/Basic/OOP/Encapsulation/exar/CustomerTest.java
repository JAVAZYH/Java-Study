package Basic.OOP.Encapsulation.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 18:11
 * \
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer( "Jane","Smith" );
       Account account=new Account();
       account.setId( 1000 );
       account.setBalance( 2000 );
       account.setAnnuallnterestRate( 0.0123 );
       customer.setAccount( account );
       account.deposit( 100 );
       account.withdraw( 960 );
       account.withdraw( 2000 );
        System.out.println(customer.getAccount().getId()+" "+customer.getFirstName()+customer.getLastName()+customer.getAccount().getBalance());
    }
}