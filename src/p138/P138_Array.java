package p138;

/**
 * 数组
 * 多个相同类型的数据按一定顺序排列的集合，通过编号的方式进行管理
 * 数组是引用数据类型，数组中的元素可以是是任何数据类型
 * 创建数组对象会在内存中开辟一整块连续的空间，数组长度一旦确定就不能修改
 * 通过下标或索引的方式调用指定位置的元素，速度很快
 * 数组可以是多维的
 */
public class P138_Array {
    public static void main(String[] args) {
        //声明和初始化一维数组
        int[] arr1,arr2;//声明

        arr1=new int[]{1,2,3,4,5};//静态初始化(数组元素内容已确定)
        arr2 = new int[5];//动态初始化(数组元素内容未确定)

        int[] arr3 = new int[]{1,2,3,4,5};//声明+静态初始化
        int[][] arr4 = new int[2][5];//声明+动态初始化

        //给数组指定元素赋值
        arr3[0]=0;
        arr4[0][0]=1;
        //从数组取值
        /*System.out.println(arr3[0]);
        System.out.println(arr4[0][0]);*/

        //获取数组的长度
        System.out.println(arr3.length);//output:5

        //数组默认初始化值
        int[] arr5=new int[2];
        //不赋值直接输出
        System.out.println(arr5[0]);//output:0,因为int类型默认初始化值是0

        /*
        不同数据类型的默认初始化值
            整型：0
            浮点型：0.0
            char型：0 注意，ascii为0的那个符号，是个很像空格的符号
            boolean：false
            引用数据类型：null
         */

    }
}
