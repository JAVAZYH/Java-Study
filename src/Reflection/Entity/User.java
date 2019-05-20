package Reflection.Entity;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/4
 * \* Time: 14:11
 * \
 */

/**
 * 实现comparable接口，让对象有可比较性
 */
public class User implements Comparable<User>{
    public String getName() {
        return name;
    }

    public User(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String name;
    private int age;
    private int score;

    /**
     * 重写compareTo方法，指定比较的方式
     * 升序：如果该对象大于等于指定对象，则返回正整数，
     * 小于等于指定对象返回负整数，等于返回0
     * 降序：大于等于返回负数，小于等于返回正数
//     * @param o
     * @return
     */
    public int compareTo(User o) {
        //根据年龄比较,升序,如果年龄相同则按分数比较
        System.out.println( "User.compareTo" );
        if (this.age>o.getAge()) {
            return 1;
        }else if (this.age<o.getAge()){
            return -1;
        }else{
            if (this.score>o.getScore()){
                return -1;
            }else if(this.score<o.getScore()){
                return 1;
            }else {
                //如果分数相同，调用string中的compareTo方法
                return this.name.compareTo( o.getName() );
            }
//            return 0;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}