package zyh.JAVABasic.OOP.Encapsulation.exar2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 16:47
 * \
 */
public class Account {

    public double getBalance() {
        return balance;
    }

    private double balance;

    public Account(double balance){
        this.balance=balance;
    }
    //取款
    public double withdraw(double money){
//        double balance=this.balance;
        if (money>this.balance){
            System.out.println("余额不足,取款失败");
        }else {
            this.balance=balance-money;
            System.out.println("成功取出："+money);
        }
        return balance;
    }

    //存款
    public double deposit(double money){
        if (money<=0){
            System.out.println("存入的数额有误");
        }else {
            this.balance=balance+money;
            System.out.println("成功存入："+money);
        }
        return this.balance;
    }

}