package zyh.test.day7;

/*
	 使用二维数组打印一个 10 行杨辉三角。
	
	【提示】
	 1. 第一行有 1 个元素, 第 n 行有 n 个元素
	 2. 每一行的第一个元素和最后一个元素都是 1
	 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
	 yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class YangHuiTest {

	public static void main(String[] args) {
		//1.创建二维数组
		int[][] numbers = new int[10][];
		//2.遍历二维数组并初始化二维数组的元素
		for (int i = 0; i < numbers.length; i++) {
			//初始化二维数组的元素
			numbers[i] = new int[i + 1];
			//给二维数组的元素的元素赋值（第一个和最后一个）
			numbers[i][0] = numbers[i][i] = 1;
			
			for(int j = 1; j < numbers[i].length - 1;j++){//遍历的是一维数组，不包括第一个和最后一个
				numbers[i][j] = numbers[i-1][j] + numbers[i-1][j-1];
			}
		}
		
		//3.遍历二维数组
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}








