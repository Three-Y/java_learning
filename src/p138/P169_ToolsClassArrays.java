package p138;

import java.util.Arrays;

/**
 * 工具类：Arrays
 * 操作数组的工具类，定义了很多操作数组的静态方法
 */
public class P169_ToolsClassArrays {
    public static void main(String[] args) {
        int[] arr1= new int[]{1,2,3,4};
        int[] arr2= new int[]{2,1,3,4};

        //equals():判断两个数组是否相等
        System.out.println("arr1与arr2是否相等："+ Arrays.equals(arr1,arr2));//output:false  元素顺序不同也是不一样的数组

        //toString():输出数组
        System.out.println("arr1:"+Arrays.toString(arr1));
        System.out.println("arr2:"+Arrays.toString(arr2));

        //fill():用指定值替换掉数组中所有元素的值
        Arrays.fill(arr1,100);
        System.out.println("arr1:"+Arrays.toString(arr1));//output:arr1:[100, 100, 100, 100]

        //sort():对数组进行排序，底层是快速排序
        Arrays.sort(arr2);
        System.out.println("arr2:"+Arrays.toString(arr2));

        //binarySearch():二分查找，找到返回索引值，找不到返回负数
        int index = Arrays.binarySearch(arr2,7);
        if(index>=0){
            System.out.println("找到了，在索引"+index+"处");
        }else{
            System.out.println("找不到，返回值是"+index);
        }

    }
}
