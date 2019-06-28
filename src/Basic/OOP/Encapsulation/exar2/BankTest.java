package Basic.OOP.Encapsulation.exar2;

import Basic.OOP.Encapsulation.exar2.Account;
import Basic.OOP.Encapsulation.exar2.Customer;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 18:24
 * \
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Account account=new Account(2000);
        bank.addCustomer( "java","zyh" );
        Customer customer=bank.getCustomer( 0 );
        customer.setAccount( account );
        customer.getAccount().deposit( 100 );
        System.out.println(customer.getAccount().getBalance());

//        int numberOfCustomer=bank.getNumberOfCustomers();
//        System.out.println("numberOfCustomer: "+numberOfCustomer);
//        Customer customer= bank.getCustomer( 0);
//        System.out.println("firstName:"+customer.getFirstName()+" lastName:"+customer.getLastName()+customer.getAccount().getId());
    }
}