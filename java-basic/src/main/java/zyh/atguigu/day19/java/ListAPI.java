package zyh.atguigu.day19.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 	
	Collection子接口之 ：List
	
	List接口的特点 ：存储的元素是有序的可重复的。
	
	|----List
		|-----ArrayList :
		|-----LinkedList :
		|-----Vector :
		
 */
public class ListAPI {
	/*
	 * 面试题
	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("ccc");
		list.add(1); //自动装箱
		
		/*
		 * remove(Object obj) : 根据元素的内容删除
		 * remove(int index) ：根据元素的索引位置删除
		 */
//		Object obj = list.remove(1);//根据索引位置删除的
		boolean boo  = list.remove(new Integer(1)); //删除的是内容1
		System.out.println(list);
	}

	/*
	 void add(int index, Object ele):在index位置插入ele元素
	boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
	Object get(int index):获取指定index位置的元素
	int indexOf(Object obj):返回obj在集合中首次出现的位置
	int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
	Object remove(int index):移除指定index位置的元素，并返回此元素
	Object set(int index, Object ele):设置指定index位置的元素为ele
	List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

	 */
	@Test
	public void test(){
		List list = new ArrayList();//编译看左边，运行看右边
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("ddd");
		
		List list2 = new ArrayList();
		list2.add(111);
		list2.add(222);
		
		//void add(int index, Object ele):在index位置插入ele元素
//		list.add(0, "AAA");
		
		
		//boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
//		list.addAll(0, list2);
		
		//Object get(int index):获取指定index位置的元素
//		Object obj = list.get(0);
		
		//int indexOf(Object obj):返回obj在集合中首次出现的位置
//		int indexOf = list.indexOf("ddd");
		
		//int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
//		int indexOf = list.lastIndexOf("ddd");
		
		//Object remove(int index):移除指定index位置的元素，并返回此元素
//		Object obj = list.remove(0);
//		System.out.println("obj=" + obj);
		
		//Object set(int index, Object ele):设置指定index位置的元素为ele
//		list.set(0, "AAA");
		
		//List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合(包头不包尾)
		List subList = list.subList(0, 2);
		
		System.out.println("subList=" + subList);
		System.out.println("list=" + list);
	}
}










