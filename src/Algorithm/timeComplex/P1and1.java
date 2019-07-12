package Algorithm.timeComplex;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 16:06
 * \
 */

/**
 * 1.1 假设有一个包含128个名字的有序列表，你要使用二分查找在其中查找一个名字，请
 *         问最多需要几步才能找到？
 */
public class P1and1 {
    public  String BinarySearch(int keyValue,int[] arr){
        int j=0;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            j++;
            int mid=(high-low)/2+low;
            int midValue=arr[mid];
            if (keyValue==midValue){
                return "要查找的数是："+midValue+"一共查找了："+j+"次";
            }
            if (keyValue<midValue){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return "未找到该数";
    }

    public static void main(String[] args) {
        P1and1 p=new P1and1();
        int arr[]=new int[128];
//        int arr[]=new int[256];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        System.out.println(p.BinarySearch(  34,arr));
    }
}