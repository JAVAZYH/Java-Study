package Collection.Map;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
   public static  void main(String args[]) throws IOException {
//test01();
//       test02();
       test03();
   }

    //基本用法，继承自HashTable
    public static void test01(){
        Properties p=new Properties();
        //设置属性一般key和value都为String类型
        p.setProperty("name","admin");
        p.setProperty("age","20");
        p.setProperty("sex","male");

//        System.out.print(p.getProperty("name"));//根据属性名获取属性值
//遍历，keySet,values,entrySet
        Enumeration<Object> keys=p.keys();
        while(keys.hasMoreElements()){
            String key=keys.nextElement()+"";
            String value=p.getProperty(key);
            System.out.print(key+value);
        }
    }

    /**
     * 属性文件：以.properties为后缀，
     * 内容格式：属性名=属性值
     * 只支持ISO-8859字符集，不支持中文
     * */
    //读取属性文件到Properties中
    public static  void test02() throws IOException {
        Properties properties=new Properties();
        /**
         * 加载属性文件(实际上只要文件内容是属性名=属性值就可以加载，与文件后缀名无关)
         *
         */
        properties.load(
                PropertiesTest.class//获取当前类想class对象
                .getClassLoader()//获取类加载器,用于加载classpath类路径下的资源
                .getResourceAsStream("Collection/data.properties")
        );
//        properties.load(PropertiesTest.class.getClassLoader().getResourceAsStream("data.properties"));
//  properties.load(new InputStreamReader(PropertiesTest.class.getClassLoader().getResourceAsStream("data"),"UTF-8"));
     System.out.print(properties);
    }

    /**
     * 查看系统属性
     */
    public static void test03(){
        //获取系统的属性集合
        Properties p=System.getProperties();
//        System.out.println(p);
        System.out.print(System.getProperty("java.home"));
    }
}
