package Basic.OOP.exar;

import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 18:17
 * \
 */
public class DayTest {


    public static void main(String[] args) {
//        Student st=new Student();
//        Teacher tc=new Teacher();
//        st.name="张三";
//        st.age=10;
//        st.major="语文";
//        st.interests="篮球";
//        System.out.println(st.say( st ));
//
//        tc.name="李四老师";
//        tc.age=10;
//        tc.teacheAge=20;
//        tc.course="数学";
//        tc.say();

        //practice 3
        Person p=new Person();
        p.age=10;
        p.study();
        p.showAge();
        p.addAge( 2 );
        p.showAge();
        Person p2=new Person();
        p2.study();
        p2.showAge();

        Circle c=new Circle();
        System.out.println(c.Calculate(  ));

    }
    /**
     * 4. 对象数组题目：
     * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
     * 问题一：打印出3年级(state值为3）的学生信息。
     * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
     */

    @Test
 public void test(){
        Student[] students=new Student[20];
     for(int i=1;i<=20;i++){
         Student stu=new Student();
         stu.number=i;
         //给学生赋值1-6年级
        stu.state=(int)(Math.random()*6+1);
        //给学生赋值成绩
        stu.score=(int)(Math.round( Math.random()*100 ));
        if (stu.state==3){
             System.out.println("三年级的学生信息为："+stu.toString());
         }
        students[i-1]=stu;
     }
     //调用冒泡排序
     new DayTest().BubbleSort( students );
 }

 public void BubbleSort(Student[] s){
        Student temp;
        //控制内层循环的次数
//        for(int i=s.length-1;i>0;i--){
//            for(int j=0;j<i;j++){
//                if (s[j].score>s[j+1].score){
//                    temp=s[j];
//                    s[j]=s[j+1];
//                    s[j+1]=temp;
//                }
//            }
//        }
     //控制几轮
        for(int i=0;i<s.length;i++){
            //控制次数
            for(int j=0;j<s.length-1-i;j++){
            if(s[j].score>s[j+1].score){
                temp=s[j];
                s[j]=s[j+1];
                s[j+1]=temp;
            }
            }
        }
        //遍历传入的学生数组
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }
 }

    /**
     * .声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
     */
    @Test
    public void test05(){
        MyDate myDate=new MyDate(2019,6,10);
        MyDate myDate1=new MyDate(2019,6,20);
        myDate.info();
        myDate1.info();
    }

}