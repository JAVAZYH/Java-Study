package zyh.JAVAadvanced.IO.objectStream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 17:24
 * \
 */

/**
 * ObjectOutputStream ObjectInputStream
 */
public class test1 {
    FileOutputStream fos=null;

    @Test
    public  void test() throws Exception {
        fos=new FileOutputStream( "oos.txt" );
        ObjectOutputStream oos=new ObjectOutputStream( fos );
        oos.writeObject( new Person("哈哈哈",10,new Address( "1","宝安区" )) );
        oos.close();
        fos.close();
    }

   @Test
   public  void test2() throws Exception {
       FileInputStream fis=new FileInputStream( "oos.txt" );
       ObjectInputStream ois = new ObjectInputStream( fis );
       Person p = (Person) ois.readObject();
       System.out.println(p.address.toString());
       System.out.println(p.toString());
       ois.close();
       fis.close();
   }
}
class Address implements Serializable {
    @Override
    public String toString() {
        return "Adderss{" +
                "id='" + id + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }

    public Address(String id, String nation) {
        this.id = id;
        this.nation = nation;
    }

    String id;
    String nation;
}