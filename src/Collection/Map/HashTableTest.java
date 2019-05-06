package Collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {
    public static  void main(String args[]){
        Hashtable<Integer,String> table=new Hashtable<>();
        table.put(1,"tom");
        table.put(2,"jack");
        table.put(3,"alice");
//        table.put(4,null);//不允许为null,编译不报错，运行报错
//        System.out.print(table);
        Enumeration<Integer> keys=table.keys();
        Enumeration<String> values=table.elements();
        while (keys.hasMoreElements()){
            Integer key=keys.nextElement();
            String value=table.get(key);
            System.out.print(key+value);
        }

        //{输出null=null}
//        HashMap<Integer, Student> map=new HashMap<Integer, Student>();
//        map.put(null,null);
//        System.out.print(map);
    }
}
