package p138;

/**
 * 数组的查找
 */
public class P163_ArraySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int s = 6;

        /*
        线性查找
        从头到尾逐个比较
         */
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println("线性：找到了，索引为" + i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("线性：找不到！");
        }

        /*
        二分法查找(binary search)
        注意：二分法只适用于有序序列的查找
        头、尾、中三个指针
        查找值直接与中间元素比较
        若查找值比中间元素大，调整头指针到中指针右一位的位置，重新计算中指针位置=(头+尾)/2
        若查找值比中间元素大，调整尾指针到中指针左一位的位置，重新计算中指针位置=(头+尾)/2
        找到元素或者头比尾大的时候比较结束
         */
        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;
        while (head <= end) {
            int middle = (end + head) / 2;
            if (s == arr[middle]) {
                System.out.println("二分：找到了！！索引为" + middle);
                isFlag=false;
                break;//不要忘记break，否则陷入死循环
            } else if (s < arr[middle]) {
                end = middle-1;
            } else {
                head = middle+1;
            }
        }
        if(isFlag){
            System.out.println("二分：找不到！！");
        }

    }
}
