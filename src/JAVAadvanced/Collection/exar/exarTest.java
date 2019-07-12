package JAVAadvanced.Collection.exar;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 15:01
 * \
 */
public class exarTest {
    @Test
    public  void test(){
//        ArrayList<String> list = new ArrayList<>();
//        list.add( "aaaa" );
//        list.add( "bbb" );
//        for(String str:list){
//            System.out.println(str);
//        }

//        HashMap<Integer, Person> map = new HashMap<>();
//        map.put( 1,new Person( "a",1 ) );
//        map.put( 2,new Person( "b",2 ) );
//        map.put( 3,new Person( "c",3 ) );
//        map.put( 4,new Person( "d",4 ) );
////        Map<Integer,Person>
//        for(Map.Entry<Integer,Person> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"---"+entry.getValue());
//        }

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(  new Person( "e",5 ));
        linkedList.add(  new Person( "b",5 ));
        linkedList.add(  new Person( "a",5 ));
        linkedList.add(  new Person( "d",5 ));
        linkedList.sort( new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                   if (o1.age!=o2.age){
                       return -(o1.age-o2.age);
                   }else{
                       return o1.name.compareTo( o2.name );
                   }
//                  return -(o1.age-o2.age);

                }
                return 0;
            }
        } );
        for(Person p:linkedList){
            System.out.println(p);
        }


    }

}