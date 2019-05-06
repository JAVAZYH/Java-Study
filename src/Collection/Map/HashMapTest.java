package Collection.Map;

import Collection.Entity.Student;

import java.util.*;

//import java.util.Collection.Algorithm.Map.Entry;
public class HashMapTest {
    public static void main(String args[]){
test01();
//        test02();
    }
    /*
    基本用法
     */
    public static void test01(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"ddd");//key是唯一的，当key已存在时表示修改对应的value
        map.put(1,"fff");
        //remove,get都是根据key来删除或者获取对应的键值对
//        map.remove(55);
        //containsKey,containsValue判断是否包含指定的key或者value，返回布尔类型
//        System.out.println(map.containsValue("bbb"));
        //size(),isEmpty()判断集合中元素的个数或者是否为空。
        System.out.println(map);
    }

    /*
    遍历hashMap（）的三种方式
     */

    public static void test02(){
    HashMap<Integer, Student> map=new HashMap<Integer, Student>();
    Student stu=new Student(1001,"tom");
    Student stu1=new Student(1002,"jack");
    Student stu2=new Student(1003,"rose");
    map.put(stu.getNo(),stu);
    map.put(stu1.getNo(),stu1);
    map.put(stu2.getNo(),stu2);
    //1.map本身无法遍历，遍历所有的key,返回的是set集合
//        Collection.Algorithm.Set<Integer> keys= map.keySet();//返回所有的key集合
////        for (Integer key:keys){
////            Student value=map.get(key);
////            System.out.println("key:"+key+",value:"+value);
////        }

        //2.遍历所有的values，返回的集合类型是接口类型,只能获取值
//        Collection<Student> values=map.values();
//        for (Student value:values){
//            System.out.println(value);
//        }

        //3.entrySet()获取所有的键值对集合，然后遍历所有的key-value键值对
        //Collection.Algorithm.Map.Entry是一个内部接口,可以直接导入也可以写为Map.Entry
       /*
       Set集合的泛型是Map.Entry类型，
       Collection.Algorithm.Map.Entry的泛型是Map集合的泛型
        */
        Set<Map.Entry<Integer,Student>> entries=map.entrySet();
        Iterator<Map.Entry<Integer,Student>> it= entries.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,Student> entry=it.next();//获取entry
            Integer key=entry.getKey();
            Student value=entry.getValue();
            System.out.println("key:"+key+",value:"+value);
        }
    }

}
