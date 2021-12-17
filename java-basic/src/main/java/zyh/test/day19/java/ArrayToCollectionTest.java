package zyh.test.day19.java;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayToCollectionTest {

	/**
	 * 将数组转集合 : Arrays.asList(T...a)
	 */
	@Test
	public void test(){
		
		String[] names = {"aa","bb"};
		
		List<String> asList = Arrays.asList(names);
		
		for (String name : asList) {
			System.out.println(name);
		}
	}
}
