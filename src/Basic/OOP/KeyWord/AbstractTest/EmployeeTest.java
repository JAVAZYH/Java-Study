package Basic.OOP.KeyWord.AbstractTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/3
 * \* Time: 11:44
 * \
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee m=new CommonEmpolyee("张三",1000,100);
        m.work();
        Employee m2=new Manager( "李四",12000,10000,2000 );
        m2.work();
//        m.work();
    }
}

class CommonEmpolyee extends  Employee{
    public CommonEmpolyee(String name, int id, double salary) {
        super( name, id, salary );
    }

    @Override
    void work() {
        System.out.println(name+id+salary);
    }
}
abstract class Employee{
    String name;
    int id;
    double salary;
    Employee(){}
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    abstract void work();
}
class Manager extends Employee{
    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super( name, id, salary );
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println(name+id+salary+bonus);
    }
}