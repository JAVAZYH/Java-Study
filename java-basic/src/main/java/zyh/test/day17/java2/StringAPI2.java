package zyh.test.day17.java2;

import org.junit.Test;

public class StringAPI2 {

	/*
	    练习题 ：
	  
	  1.将字符串中的内容全部转成小写
	  
	  2.将字符串中的内容全部转成大写
	  
	  3.将字符串中的内容大写转成小写，小写转成大写
	  
	  4.统计字符串中"abcdefabcddabc"abc出现的次数
	  
	  	提示：
	  	charAt(int index)
	  	indexOf(String str,int index)
	   
	   字符的大写转小写，小写转大写。 A -> 65    a -> 97
	 */
	/*
	 * 4.统计字符串中"abcdefabcddabc"abc出现的次数
	 */
	@Test
	public void test3(){
		
		String str = "abcdefabcddabcabcabcabcabc";
		
		int count = 0; //字符串出现的次数
		String findStr = "abc";
		int index = 0; //从哪个索引位置开始向后进行查找
		
		while((index = str.indexOf(findStr, index)) != -1){ //如果等于-1就说明没找到
			count++;
			//下一次要开始查找的索引值的位置。
			index += findStr.length();
		}
		
		System.out.println("一共出现了" + count);
		
		
	}
	
	/*
	 * 4.统计字符串中"abcdefabcddabc"abc出现的次数
	 */
	@Test
	public void test2(){
		
		String str = "abcdefabcddabc";
		
		int count = 0; //字符串出现的次数
		String findStr = "abc";
		
		//indexOf(findStr,0)：从当前字符串0位置开始，findStr第一次出现的位置（从左到右）
		int indexOf = str.indexOf(findStr, 0);
		
		while(indexOf != -1){
			//如果找到了count+1
			count++;
			
			//继续查找
			indexOf = str.indexOf(findStr, indexOf + findStr.length());
		}
		
		System.out.println("一共出现了" + count);
		
		
	}
	
	/*
	 *   1.将字符串中的内容全部转成小写
	 */
	@Test
	public void test(){
		
		String str = "AbCdddEf";
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			//获取str中的每一个字符
			char c = str.charAt(i);
			
			//判断字符是否为大写，如果为大写转成小写
			if(c >= 'A' && c <= 'Z'){
				//将大写转成小写
				c += 32;
			}
			
			newStr += c; //字符串拼接
		}
		
		System.out.println(newStr);
		
	}
	
	
	
}













