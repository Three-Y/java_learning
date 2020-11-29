package P303;

/**
 * static关键字
 *      某些特定的数据在内存空间中只有一份
 *      用来修饰属性、方法、代码块、内部类
 *      非静态属性随着类的加载而加载，先于对象被加载
 *      通过 类名.静态变量名 的方式调用，也可以使用 实例变量.静态变量名 的方式调用
 *
 * 静态变量（类变量）
 *      使用static修饰的变量，同一个类中的所有对象共享同一个静态变量
 *
 * 非静态变量（实例变量）
 *      每个对象都有一套属于自己的非静态属性，修改某对象的非静态属性不影响其它对象的非静态属性值
 *
 * 静态方法
 *      可以通过 类名.静态方法名() 的方式调用
 *      静态结构内不能调用非静态方法或属性
 *
 */
public class P313_Static {
    public static void main(String[] args) {
        System.out.println(Chinese.nation);//China

        Chinese c1 = new Chinese();
        Chinese c2 = new Chinese();

        System.out.println(c1.nation);//China
        System.out.println(c2.nation);//China

        Chinese.nation = "中国";

        System.out.println(Chinese.nation);//中国
        System.out.println(c1.nation);//中国
        System.out.println(c2.nation);//中国

        Chinese.happy();//每天开心
        c1.happy();//每天开心
        c2.happy();//每天开心

    }
}

class Chinese{
    static String nation = "China";
    String name;

    public static void happy(){
        System.out.println("每天开心");
        //eat();//静态结构内不能调用非静态方法
        //System.out.println(this.name);//静态结构内不能调用非静态属性
    }

    public void eat(){
        System.out.println(this.name);
        System.out.println(Chinese.nation);
        System.out.println("吃吃吃~");
        happy();//非静态结构内既可以调用静态结构，也可以调用非静态结构
    }
}