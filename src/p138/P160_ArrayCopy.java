package p138;

/**
 * 数组的复制
 *
 */
public class P160_ArrayCopy {
    public static void main(String[] args) {
        int[] arr1, arr2;

        arr1 = new int[]{1, 2, 3, 4, 5, 6};

        //打印arr1
        System.out.print("arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ";");
        }
        System.out.println();

        /*
        arr2=arr1只是将数组的地址（引用）复制给了arr2，内存中只有一个数组而已
        此时arr2和arr1指向同一个数组，通过arr2修改数组，修改的其实是同一个数组
         */
        arr2=arr1;

        /*
        真正复制数组
        新建一个数组，并将原数组的值按顺序复制到新数组
         */
//        arr2=new int[arr1.length];
//        for(int i=0;i<arr2.length;i++){
//            arr2[i]=arr1[i];
//        }

        //修改arr2
        for (int i=0;i<arr2.length;i++){
            arr2[i]=arr2[i]*2;
        }

        //再次打印arr1
        System.out.print("修改arr2后，arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ";");
        }
        System.out.println();

        //打印arr2
        System.out.print("修改arr2后，arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ";");
        }


    }
}
