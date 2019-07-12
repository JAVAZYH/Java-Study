package JAVAadvanced.Exception.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 18:34
 * \
 */
public class EcmDef{
    public static void main(String[] args){
        try{
            int i=Integer.parseInt(args[0]);
            int j=Integer.parseInt(args[1]);
            System.out.println(i/j);

        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }

    }
}