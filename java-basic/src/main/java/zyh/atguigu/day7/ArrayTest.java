package zyh.atguigu.day7;

/*
 	多维数组（二维数组）:
 	
 	说明：
 		1.二维数组中的元素是一维数组。
 		2.二维数组的元素是引用数据类型。
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//1.二维数组的声明和初始化
		String[][] persons;
		String persons2[][];
		String[] persons3[];
		//1.1二维数组的初始化
		//静态初始化：
		persons = new String[][]{{"苍老师","110000"},{"小泽老师","110011"},{"小龙哥","112233"}};
		//下面的方式的声明和初始化不能分开进行
		String[][] persons4 = {{"苍老师","110000"},{"小泽老师","110011"},{"小龙哥","112233"}};
		//动态初始化：
		//方式一
		//3指的是二维数组的长度，2指的是二维数组元素的长度。
		int[][] numbers = new int[3][2];//3指的是二维数组元素的个数，2指的是二维数组的元素（一维数组）的元素的个数。
		//方式二 : 如果二维数组的元素的长度不一样可以采用下面的方式
		int[][] numbers2 = new int[3][];
		//给二维数组的0索引值的位置上的元素赋值
		numbers2[0] = new int[2];
		numbers2[1] = new int[3];
		numbers2[2] = new int[2];
		
		//2.获取二维数组元素的值
		//获取元素的值
		//1指的是二维数组的索引值，0指的是一维数组的索引值。
		String name = persons[1][0];
		name = persons[2][0];
		System.out.println(name);
		//给二维数组赋值
		numbers[0][1] = 20;
		System.out.println(numbers[0][1]);
		
//		3.二维数组的属性 ：length
		//获取numbers的长度
		System.out.println(numbers.length);
		//获取numbers索引值为0的元素的长度
		System.out.println(numbers[0].length);
		//获取numbers2索引值为1的元素的长度
		int[] ns = numbers2[1]; //二维数组的元素是一个一维数组
		System.out.println(ns.length);
		
		System.out.println("--------------------------------------");
		//4.二维数组元素的默认值 - null
		//二维数组的元素的元素的默认值和一维数组元素的默认值是一样的
		int[][] scores = new int[2][];
		System.out.println(scores[0]);
		
		System.out.println("--------------------------------------");
		//5.遍历二维数组的元素
		/*
		 * 思路：
		 * 		1.先把二维数组的元素遍历出来
		 * 		2.再遍历一维数组
		 */
		//persons = new String[][]{{"苍老师","110000"},{"小泽老师","110011"},{"小龙哥","112233"}};
		//遍历的是二维数组的元素
		for (int i = 0; i < persons.length; i++) {
			String[] person = persons[i];
			//遍历的二维数组的元素（一维数组）的元素
			for (int j = 0; j < person.length; j++) {
				System.out.println(person[j]);
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				System.out.println(persons[i][j]);
			}
		}

		
	}
}











