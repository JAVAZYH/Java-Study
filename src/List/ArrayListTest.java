package List;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
//            test01();
//            test02();
//        test03();
//        List test= CreateList();
//        long startTime=System.currentTimeMillis();
////        test04();
////        Collections.binarySearch(  )
//        System.out.println(  test.get( 9999 ) );
//        long endTime=System.currentTimeMillis();
//        System.out.print( "方法的执行时间为："+(endTime-startTime) +"毫秒");
   test5();
    }

    /**
     * 基本用法
     */
    public static void test01() {
//        ArrayList list=new ArrayList();
//        List<String> list1=new java.util.ArrayList<>(  );
//        list.add( "123" );
//        list.add(  100);
//        list.add( 10.2 );
//
//        System.out.println( list );
    }

    /**
     * 常用用法
     */
    public static void test02() {
//            ArrayList<String> test=new ArrayList<>(  );
//            test.add( "zyh0" );
//            test.add( "zyh1" );
//            test.add( "zyh2" );
////            test.add( "zyh0" );
//            System.out.println( test );
//
//            //向指定索引位置添加，索引从0开始
////            test.add( 2 ,"zyh2");
//
//
//            //set修改方法，返回string 0或1
//            //   String str=test.set( 0 ,"zyh0");
////          System.out.println( str );
//
//            //remove删除，返回一个布尔值,如果有重复值只删除第一个
////            System.out.println(  test.remove( "1" ));
//
//            //根据索引删除，返回被删除的元素
////            System.out.println( test.remove( 1 ) );
//
//            //get根据下标获取元素
////            System.out.println( test.get( 1 ) );
//
//            //size获取集合的大小，长度
////            System.out.println( test.size() );
//
//            //isEmpty()判断是否为空，返回布尔值,源码根据size是否为空来判断
////            System.out.println( test.isEmpty() );
//
//            //indexOf()指定元素在集合中的索引，第一次出现的位置,不存在返回-1
////            System.out.println( test.indexOf( "zyh0" ) );
//            //lastIndexOf(),最后一次出现的位置
////            System.out.println( test.lastIndexOf( "zyh0" ) );
//
//            //contains()是否包含指定元素，返回一个布尔值
////            System.out.println( test.contains( "zyh0" ) );
//
//            //clear()清空当前list
////                 test.clear();
//
//            //toArray（）返回一个object对象数组
////            test.toArray();
//
//            //将数组转为list
////            String[]arr={"aaa","bbb","ccc"};
////           List<String> list2= Arrays.asList( arr );
////           System.out.println( list2 );
////
////          System.out.println( test );
//
    }

    /**
     * 遍历集合
     */
    public static void test03() {
        List<Integer> list = Arrays.asList( 12, 4, 2, 5, 3 );
//        for (Integer num : list) {
//            System.out.println( num );
//        }

        //使用迭代器，遍历集合中所有元素的一种类型
        Iterator<Integer> iterator=list.iterator();
        //判断是否还有下一个元素
        while (iterator.hasNext()){
            //获取下一个元素
            System.out.println( iterator.next() );
        }
    }

    /**
     * 测试性能
     */
    public static List CreateList(){
        ArrayList<String>list=new ArrayList<>(  );
//        LinkedListTest<Integer>list=new LinkedListTest<>(  );
        for (int i=0;i<10000000;i++){
            list.add( "test"+i);
        }
        return list;
    }
//    public static void test04(){
//
//        System.out.println(   test.get( 999 ));
//    }

    /**
     * 删除list中能被3整除的数
     */
    public static void test5(){
       List<Integer> list=new ArrayList<>(  );
        list.add( 9 );
        list.add( 9 );
        list.add( 6);
        list.add( 8 );
        list.add( 1 );
        System.out.println( "操作前"+list );
        for (int i=list.size()-1;i>=0;i--){
            int num=list.get( i );
            if (num%3==0){
                list.remove( new Integer( num ) );
            }
        }
        System.out.println( "操作后"+list );
    }
}

