package Basic.OOP.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 18:20
 * \
 */
public class Student {
//    String name;
//    int age;
//    String major;
//    String interests;
    int number;
    int state;
    int score;
//    public String say(Student s){
//        return "姓名： "+s.name+" 年龄： "+s.age+" 主修课程： "+s.major+" 兴趣： "+s.interests;
//    }

    @Override
    public String toString() {
        return " 学号："+this.number+" 年级："+this.state+" 成绩："+this.score;
    }
}