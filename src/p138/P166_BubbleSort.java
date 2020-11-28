package p138;

/**
 * 冒泡排序
 * 从第一个元素开始，与右邻元素两两比较，大的元素换到右边
 * 共比较（元素个数-1）大轮，第一轮得到最大数放在最后，第二轮得到第二大数放在倒数第二，以此类推
 * 每一轮都要比上一轮少比较一次（减去了放在最后的那些已确定位置的元素个数）
 */
public class P166_BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{45, 25, 14, 75, 89, 35, 52, 55, 69, 23};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }
    }
}
