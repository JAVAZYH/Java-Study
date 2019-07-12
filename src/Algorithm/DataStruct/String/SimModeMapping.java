package Algorithm.DataStruct.String;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 11:41
 * \
 */
public class SimModeMapping {
    public int index(String s,String t,int pos){
        int i=pos;
        int j=0;
        while (i<s.length()&&j<t.length()){
            //如果主串s的字符和子串t的字符相等，就往后移一位
            if (s.charAt( i )==t.charAt( j )){
                i++;
                j++;
            }else {
                //否则就把i重置到主串的下一位，让子串的j重置到子串的首位
                i=i-j+1;
                j=0;
            }
        }
        if (j==t.length()) {
            //如果j等于子串的长度就返回下标值
            return i - j;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        SimModeMapping smm=new SimModeMapping();
        int a=smm.index( "goodgoogle","google",0 );
        System.out.println(a);
    }
}