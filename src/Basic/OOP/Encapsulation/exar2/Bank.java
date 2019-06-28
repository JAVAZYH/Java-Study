package Basic.OOP.Encapsulation.exar2;

import Basic.OOP.Encapsulation.exar2.Customer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 18:19
 * \
 */

/**
 * 	addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。还必须把 numberOfCustomer 属性的值加 1。
 * 	getNumOfCustomers 方法返回 numberofCustomers 属性值。
 * 	getCustomer方法返回与给出的index参数相关的客户。
 */
public class Bank {
    //存放多个用户
    private  Customer customers[];
    //记录用户数量
    private int numberOfCustomer;
    //动态初始化数组
    Bank(){
        this.customers=new Customer[10];
    }
    public void addCustomer(String firstName,String lastName){
         if (numberOfCustomer<customers.length){
             Customer customer=new Customer( firstName,lastName);
             customers[numberOfCustomer]=customer;
             numberOfCustomer++;
         }else {
             System.out.println("用户已满");
         }
//        this.customers=new Customer[numberOfCustomer+1];

    }

    public  int getNumberOfCustomers(){
        return  this.numberOfCustomer;
    }

    public  Customer getCustomer(int index){
        if (index>=0 && index<numberOfCustomer){//预防下角标越界
            return customers[index];
        }else {
            return null;
        }

    }
}