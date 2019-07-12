package JAVAadvanced.Thread.before;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/5
 * \* Time: 12:14
 * \
 */
public class RandomRunner implements  Runnable{
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean flag=true;

    @Override
    public void run() {
     while (flag){
         int n=(int)(Math.random()*100);
         System.out.println(n);
     }
    }
}