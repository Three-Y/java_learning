package p174;

/**
 * 方法的重载
 *
 * 两同一不同：
 *      同一个类，同一个方法名
 *      参数列表不同：①参数个数不同 ②参数类型不同 ③多个参数类型，其之间的顺序不同
 *
 * 以下的不同不属于重载：
 * 方法的权限修饰符、返回值类型、形参变量名、方法体
 */
public class P204_Overload {
    public static void main(String[] args) {
        /*
        假如有两个参数类型相似的重载方法
        会根据传递的类型，优先调用参数类型最接近的方法
         */
        int i = 1;
        double d = 2.0;
        //假如class OL中同时有public void m2(int i)和public void m2(double d)
//        new OL().m2(i); //output:我是m2(int i)
//        new OL().m2(d); //output:我是m2(double d)

        //假如class OL中只有public void m2(double d)
        new OL().m2(i); //output:我是m2(double d)
        new OL().m2(d); //output:我是m2(double d)
    }
}

class OL{
    /*
    以下是重载的例子
     */
    public void m(int i) {
    }

    public void m(int i1, int i2) {//参数个数不同
    }

    public void m(int i, String s) {//参数类型不同
    }

    public void m(String s, int i) {//参数顺序不同
    }

    /*
    以下的都不是重载
     */
//    public void m(int abcd){//参数名不同
//    }
//
//    public int m(int i){//返回值不同
//        return 0;
//    }
//
//    private void m(int i){//权限修饰符不同
//    }
//
//    public void m(int i){//方法体不同
//        System.out.println("随便写点东西");
//    }

    public void m2(double d){
        System.out.println("我是m2(double d)");
    }

//    public void m2(int i){
//        System.out.println("我是m2(int i)");
//    }
}