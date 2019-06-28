package atguigu.day7;

/*
 	二维数组的内存解析
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		
		String[][] persons = new String[3][];
		
		persons[0] = new String[2];
		persons[1] = new String[3];
		persons[2] = new String[2];
		
		persons[0][0] = "志玲";
		persons[1][1] = "112222";
		persons[2][0] = "刚哥";
		
		
		for(int i = 0; i < persons.length; i++){
			
			for(int j = 0; j < persons[i].length; j++){
				System.out.print(persons[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
