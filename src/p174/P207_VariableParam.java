package p174;

/**
 * 可变参数
 * 格式：数据类型...变量名
 *
 * 调用具有可变参数的方法时，参数可以是0、1、多个
 * 可变参数与数组属于同一种参数列表
 */
public class P207_VariableParam {
    public static void main(String[] args) {
        new VB().m("hello");            //调用的是m(String s)
        new VB().m("hello", "world");//调用的是m(String...str)
        new VB().m();                      //调用的是m(String...str)
    }
}

class VB{
    /*
    这两个方法也属于重载
     */
    public void m(String...str){
        System.out.println("调用的是m(String...str)");
    }
    public void m(String s){
        System.out.println("调用的是m(String s)");
    }
    /*
    注意，编译器会认为，可变参数与数组是同一种参数列表
     */
//    public  void m(String[] s){
//        System.out.println();
//    }

    /*
    同时有m(String...str)和m(String s,String...str)
    此处没有报错，但是如果调用时传递多个String参数，调用处会报错
    如果没有m(String s)，那调用时传递一个String也会报错
     */
//    public void m(String s,String...str){
//        System.out.println("调用的是m(String s,String...str)");
//    }

    /*
    可变参数必须放最后
     */
    public void m(int i,String...str){
        System.out.println("调用的是m(int i,String...str)");
    }

//    public void m(String...str,int i){
//
//    }
}