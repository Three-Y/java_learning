package p138;

/**
 * 数组的反转
 */
public class P162_ArrayReverse {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        //方法一：
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        //方法二：
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+";");
        }
        System.out.println();
    }
}
