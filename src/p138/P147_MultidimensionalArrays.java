package p138;

/**
 * 二维数组
 * 数组的元素是一个数组，这个数组就是二维数组，若二维数组的元素还是数组，此数组就是三维数组，以此类推
 */
public class P147_MultidimensionalArrays {
    public static void main(String[] args) {
        //二维数组初始化
        int[][] arr1 = new int[][]{{1, 2}, {3, 4}};//静态初始化
        int[][] arr2 = new int[2][2];//动态初始化1
        int[][] arr3 = new int[2][];//动态初始化2
        int[] arr4[] = new int[2][2];//动态初始化3，这也是二维数组
        int[][] arr5 = {{1, 2}, {3, 4}};//类型推断，左边其实已经声明是int型，右边就不可能new其它类型，所以可以省略

        //调用二维数组中的元素
//        System.out.println(arr5[0][1]);//output:2

        //多维数组的长度
        int[][][] arr6=new int[][][]{ {{5,1,2},{1},{6,9}} , {{7},{8,10,12,145}} };
//        System.out.println(arr6.length);//output:2
//        System.out.println(arr6[0].length);//output:3
//        System.out.println(arr6[0][0].length);//output:3

        //遍历多维数组
//        for(int i=0;i<arr6.length;i++){
//            for(int j=0;j<arr6[i].length;j++){
//                for(int k=0;k<arr6[i][j].length;k++){
//                    System.out.print(arr6[i][j][k]+",");
//                }
//                System.out.println();
//            }
//        }

        //二维数组的默认初始化值
        int[][] arr7=new int[2][3];
        System.out.println(arr7);//output:[[I@1b6d3586  前面有两个“[”,表示它指向的是一个二维数组，后面是地址值
        System.out.println(arr7[0]);//output:[I@4554617c  前面有一个“[”,表示它指向的是一个一维数组，后面地址值
        System.out.println(arr7[0][0]);//output:0

        int[][] arr8=new int[2][];
        System.out.println(arr8);//output:[[I@74a14482
        System.out.println(arr8[1]);//output:null arr8[1]还没赋值，但是已经确定这里将要放的是数组，数组是引用类型

    }
}