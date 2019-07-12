package JAVAadvanced.Collection.CollectionsUtil;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 14:42
 * \
 */
public class coll {
  @Test
  public  void test(){
    ArrayList list = new ArrayList<>();
    list.add( "1" );
    list.add( "2" );
    list.add( "3" );
    list.add( "4" );
    list.add( "5" );
//    Collections.shuffle( list );
    Collections.sort( list);
    System.out.println(list);

  }
  //写一个学生类录入学生姓名和成绩。按成绩排序显示前三名。
  @Test
  public  void test2(){
    ArrayList<Student> students = new ArrayList<>();
    for(int i=0;i<10;i++) {
      int m= (int) (Math.random()*10);
      students.add( new Student( "张三" + i,   m) );
    }
//    students.sort( new Comparator<Student>() {
////      @Override
////      public int compare(Student o1, Student o2) {
////        return o1.score-o2.score;
////      }
////    } );
    Collections.sort( students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.score-o2.score;
      }
    } );

    System.out.println(students);
    int j=0;
    for (Student student:students){
      if (j==3){
        break;
      }
      System.out.println(student);
      j++;
    }
  }

  /**
   * 1.将10个随机数保存到List中，并按倒序、从大到小的顺序显示出来
   */
  @Test
  public  void test3(){
//    ArrayList<Double> doubles = new ArrayList<>();
//    DecimalFormat df = new DecimalFormat("0.00");
////    Random random = new Random();
    double a=Math.random()*10;
    double b=new Random().nextDouble()*10;
    System.out.println(a+"------"+b);
//    double a=Math.random()*10;
//    DecimalFormat df = new DecimalFormat( "0.00" );
    String.format(String.format("%.2f", a)  );
    System.out.println(  String.format(String.format("%.2f", a)  ));
//    for(int i=0;i<10;i++){
////      System.out.println(String.format("%.2f",  random.nextDouble()*10 ));
////      double m= Double.parseDouble( String.format("%.2f",  random.nextDouble()*10 ) );
////      double m= Double.parseDouble( df.format( random.nextDouble()*10 ) );
////      doubles.add(m );
//    }
//    System.out.println(doubles);
//    System.out.println("---sort---");
//    Collections.reverse( doubles );
//    System.out.println(doubles);
  }
}