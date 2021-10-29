package zyh.JAVABasic.OOP.Encapsulation.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 16:47
 * \
 */
public class Account {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    private double balance;
    private double annuallnterestRate;

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