package p174;

/**
 * 属性（成员变量）vs局部变量
 *      相同：
 *          定义格式：变量类型 变量名=变量值
 *          先声明后使用
 *          都有其对应的作用域
 *      不同：
 *          声明的位置不同
 *              属性：在类的{}中声明
 *              局部变量：可以声明在方法、方法形参、代码块、构造器形参、构造器内
 *          权限修饰符不同
 *              属性：可使用权限修饰符，public/private/protected/缺省=protected
 *              局部变量：不可使用权限修饰符
 *          默认初始化的情况不同
 *              属性：根据类型的不同有不同的默认初始化值
 *              局部变量：没有默认初始化值，如果调用前必须初始化
 *          在内存中的位置不同
 *              属性：在堆空间
 *              局部变量：在java栈
 */
public class P182_MemberOrLocalVariable {
    public static void main(String[] args) {
        User user = new User();

        //不给属性赋值，直接调用
        System.out.println(user.name);//output:null
        System.out.println(user.age);//output:0

        //不初始化局部变量，直接调用
//        int i;
//        System.out.println(i);//提示i未初始化

        //局部变量-形参
//        user.talk();//没有传递参数，形参未初始化，无法调用方法
        user.talk("粤语");
    }
}

class User {
    String name;
//    public String name;//成员变量可以使用权限修饰符
    int age;


    public void talk(String language) {//language是形参
        System.out.println("我交流用" + language);
    }

    public void eat() {
        String food = "米饭";
//        public String food = "米饭";//不能给局部变量添加权限修饰符
        System.out.println("我正在" + food);
    }
}
