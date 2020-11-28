package P258;

/**
 * 方法的重写：子类声明与父类同名同参数的方法，覆盖父类的方法
 *
 * 规定：
 *      子类重写的方法的方法名和形参列表与父类相同
 *      方法的权限修饰符：
 *          子类重写的方法的权限修饰符要大于或等于父类被重写方法
 *          子类无法重写父类private的方法
 *      方法返回值：
 *          若父类方法的返回值是void，子类重写方法的返回值也只能是void
 *          若父类方法的返回值是A类，子类重写方法的返回值可以是A类或A的子类
 *          若父类方法的返回值是基本数据类型，子类重写方法的返回值只能是相同的基本数据类型
 *      方法抛出的异常：
 *          子类重写的方法抛出的异常不大于父类被重写方法抛出的异常
 *      static方法不能被重写
 *
 * 注意：如果父类与子类的同名方法的参数，一个是A类型的数组，另一个是A类型的可变参数，也认为子类的此方法是重写方法
 */
public class P270_Overwrite {
    public static void main(String[] args) {
        Son son = new Son();
        //调用重写过的方法，调用的是子类的方法
        son.eat("大鸡腿");//儿子吃大鸡腿
        //调用未重写的方法
        son.walk();//爸爸走路

        Father father = new Father();
        //父类调用子类重写过的方法，调用的仍是父类的方法
        father.eat("盐焗鸡");//爸爸吃盐焗鸡

    }
}

class Father {
    public void eat(String s) {
        System.out.println("爸爸吃" + s);
    }

    public void walk() {
        System.out.println("爸爸走路");
    }

    private void talk() {
        System.out.println("我是爸爸");
    }

    public Object m() {
        return null;
    }

    public void n(int...i){//父类使用的是可变参数

    }
}

class Son extends Father {
    //子类重写父类的eat方法
    public void eat(String str) {
        System.out.println("儿子吃" + str);
    }
    //子类没有重写父类的walk方法

    //没有报错，但是，此方法不是重写的方法，父类的私有方法无法重写
    private void talk() {
        System.out.println("我是我");
    }

    //String是Object的子类，此处也属于重写
    public String m() {
        return null;
    }

    public void n(int[] i){//子类使用的是数组，也属于重载！

    }
}