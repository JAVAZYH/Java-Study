package zyh.test.day19.java2;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 	Collection子接口之：Set
 	
 	Set存储元素的特点 ：存储的元素是无序的，不可重复的。
 	
 	Set的实现类：
 	
 		|-----Set
 			|-----HashSet:
 			
 				|-----LinkedHashSet:
 				
 			|------TreeSet:
 	
 	说明：
 		1.无序性 ：不是指的随机性,指的是hashCode方法算出的哈希值决定元素所存储的位置。位置是没有顺序的。
 		2.不可重复性 ：调用对象所在的equals方法，如果返回值是true就认为是相同的。那么就不能添加。
 		
 
 	HashSet的底层实现原理？
 		当我们向集合中添加元素a时，首先会根据hashCode方法计算出哈希值,从而算出元素存放的位置。
 		如果该位置上没有其它元素则直接放入。如果该位置止已经存在其它元素那么就调用该对象所在类的equals方法进行比较。
 		如果返回值为true则说明两个元素内容相同，则不能存放到该集合中。如果返回值为false则说明两个元素不一样。
 		那么将以链表的形式将该元素存放到该集合中。
 */
public class SetTest {
	
	/*
	 * LinkedHashSet :LinkedHashSet继承了HashSet,LinkedHashSet的底层实现原理和HashSet是一样的。
	 * 		LinkedHashSet可以安照添加元素的顺序进行遍历。因为底层维护了一张链表用来记录元素添加的顺序。
	 */
	@Test
	public void test3(){
		LinkedHashSet set = new LinkedHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add( "a") ;
		
		System.out.println(set);
	}
	
	/*
	 	如果Set集合中存放自定义类的对象，那么该对象所在的类必须重写equals和hashCode方法。
	 */
	@Test
	public void test2(){
		HashSet set = new HashSet();
		Person p1 = new Person("aa", 18);
		set.add(p1);
		
		Person p2 = new Person("cc",18);
		set.add(p2);
		
		System.out.println(set);
	}

	@Test
	public void test(){
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("ddd");
		
		System.out.println(set);
	}
}











