package zyh.Algorithm.DataStruct.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/30
 * \* Time: 9:12
 * \
 */
public class LinerListTest {
         public static final int MAX_SIZE=100;
        public  static int arr[]=new int[MAX_SIZE];

        public int getElement(int index,int[] arr){
            if (index<0||index>=arr.length){
                return -1;
            }
            return arr[index];
        }
    public int insert(int index,int data,int[] arr){
        if(arr.length>MAX_SIZE||index<0||index>=arr.length){
            return -1;
        }
        for(int j=arr.length-1;j>index;j--){
            arr[j]=arr[j+1];
        }
        return 1;
    }

    public static void main(String[] args) {
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        LinerListTest linerListTest=new LinerListTest();

        linerListTest.insert( 2,90,arr );
        System.out.println(linerListTest.getElement( 2,arr ));
    }

}