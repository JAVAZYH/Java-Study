package zyh.test.day19.java;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

/**
 	
	
	List接口的实现类：
	|----List
		|-----ArrayList :
		|-----LinkedList :
		|-----Vector :
		
	[面试题]List的实现类有哪些？有什么区别？
		实现类有：ArrayList,LinkedList,Vector.
		相同点 ：都实现了List的接口，存储的元素都是有序可重复的。
		不同点：
			ArrayList : List的主要实现类，底层是一个数组。线程不安全的。数组查找快，增删慢。
			LinkedList : 底层是一个双向链表。线程不安全的。链表的增删快，查找慢。
			Vector : 古老的实现类，底层是一个数组。线程安全的。数组查找快，增删慢。
	
	[面试题]ArryaList的底层实现？
		当我们使用空参的构造器创建对象时，底层会创建一个长度为10的数组。当我们向集合中添加第11个元素时，底层会进行扩容。
		扩容为原来数组长度的1.5倍。同时将原来数组中的内容复制到新的数组中。
	
	ArrayList的构造器？
		new ArrayList() : 底层创建了一个长度为10的数组
		new ArrayList(int initialCapacity) :创建一个长度为initialCapacity的数组
	
 */
public class ListTest {
	
	/*
	 	LinkedList的API
	 	
	 	void addFirst(Object obj) : 向集合的头部添加一个元素
		void addLast(Object obj) ： 向集合的尾部添加一个元素	
		Object getFirst() ：获取集合中的第一个元素
		Object getLast() ：获取集合中最后一个元素
		Object removeFirst() ：删除集合中第一个元素并返回
		Object removeLast() : 删除集合中最后一个元素并返回

	 */
	@Test
	public void test2(){
		
		LinkedList list = new LinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.addFirst("AAA");
		System.out.println(list);
	}

	@Test
	public void test(){
		
		ArrayList list = new ArrayList();
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		System.out.println(list.size());
		System.out.println(list);
		
		LinkedList ll = new LinkedList();
		ll.add("aaa");
		
	}
}
