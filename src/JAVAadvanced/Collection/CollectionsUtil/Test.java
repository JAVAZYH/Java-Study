package JAVAadvanced.Collection.CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public  static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(43);
        list.add(7);
        list.add(56);
        System.out.println(list);

        //addAll添加
        Collections.addAll(list,1,5,4,8,2);

        //max最大值min最小值
//        System.out.println(Collections.max(list));

        //sort排序
//         Collections.sort(list);

        //降序自定义比较器
//     Collections.sort(list, new Comparator<Integer>() {
//         @override
//         public int compare(Integer o1, Integer o2) {
//           if (o1>o2){
//               return -1;
//           }else if (o1<o2){
//               return 1;
//           }else {
//               return 0;
//           }
//         }
//     });

        //reverse()反转
//        Collections.reverse(list);

        //replaceAll替换
//        Collections.replaceAll(list,2,567);

        //swap交换
//        Collections.swap(list,0,list.size()-1);

        //fill填充/初始化
//        Collections.fill(list,0);


        /**
         * Collections和collection区别：
         * Collections是类,提供了相关操作的工具类
         * Collection是接口，主要有List，Set，Map
         */
        System.out.println(list);
    }
}
