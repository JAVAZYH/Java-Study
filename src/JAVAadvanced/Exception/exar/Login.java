package JAVAadvanced.Exception.exar;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \*J User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 18:53
 * \K
 */
public class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        String name=scanner.nextLine();
//        System.out.println();
        String password=scanner.nextLine();
        try {
            if (!name.equals( "john" )){
                throw new MyException("用户名未找到");
            }
            else if(!password.equals( "000" )){
                throw  new MyException( "密码不正确" );
            }
            System.out.println("验证通过");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}