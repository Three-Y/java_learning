package P258;

/**
 * 多态：一个物体的多种形态
 *
 * 父类引用子类对象：
 *      左边声明为父类类型，右边new的是子类的对象
 *      调用方法时，呈现出的仍然是子类重写的效果
 *      因为声明为父类类型，在编译器看来，这个对象是父类的，所以不能调用子类特有的方法
 *
 * 总结：编译期，只能调用父类声明的方法；运行期，实际执行的是子类重写的方法
 *      编译看左边，运行看右边
 *
 * 注意：属性不具有多态性
 *      假如父类和子类有同名属性，当父类引用子类对象时，调用的是父类的属性
 *      无论编译还是运行，都看左边
 *
 * 强制类型转换：较高级基本数据类型==>较低级基本数据类型 或 父类类型==>子类类型
 *      将声明为父类类型的对象，强转为子类类型，就可以调用子类特有的方法和属性
 *      注意：有风险，如果强转的类型不是对象实际的类型，会抛异常ClassCastException
 *
 * instanceof关键字
 *      判断对象是不是某类型的实例，是返回true，否返回false
 *      用法：a instanceof A
 *
 */
public class P278_Polymorphism {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Customer man = new Man();
        Customer woman = new Woman();

        //调用方法，最后调用的是子类的重写的方法
        man.pick();//男顾客快速地逛了一圈店铺
        woman.pick();//女顾客在店里看了很久

        //此时不能调用子类特有的方法
//        man.goHome();
//        woman.rest();

        //强制类型转换(有风险)，可以调用子类特有的属性和方法
        Man man1 = (Man) man;
        //Woman women1 = (Woman) man;//编译不会报错，但是运行会抛异常ClassCastException
        man1.goHome();

        //instanceof关键字
        if(woman instanceof Woman){
            Woman woman1 = (Woman) woman;
            ((Woman) woman).rest();
        }

        //一个方法可以适应多种类型
        Salesperson salesperson = new Salesperson();
        salesperson.checkOut(man);
        salesperson.checkOut(woman);

        //接收Customer子类类型也行
        System.out.println("*********以下是声明为Man的对象*********");
        Man m  = new Man();
        salesperson.checkOut(m);
    }
}

class Customer{
    public void pick(){
        System.out.println("顾客在挑选商品");
    }

    public void buy(){
        System.out.println("顾客花钱买下商品");
    }

    public void pay(){
        System.out.println("顾客付钱");
    }
}

class Man extends Customer{
    @Override
    public void pick() {
        System.out.println("男顾客快速地逛了一圈店铺");
    }

    @Override
    public void buy() {
        System.out.println("男顾客买了一点需要的东西");
    }

    @Override
    public void pay() {
        System.out.println("男顾客付了不多不少的钱");
    }

    public void goHome(){
        System.out.println("男顾客回家");
    }
}

class Woman extends Customer{
    @Override
    public void pick() {
        System.out.println("女顾客在店里看了很久");
    }

    @Override
    public void buy() {
        System.out.println("女顾客最后买了很多东西");
    }

    @Override
    public void pay() {
        System.out.println("女顾客付了很多钱");
    }

    public void rest(){
        System.out.println("女顾客去奶茶店休息");
    }
}

class Salesperson{
    /*
    有了多态，无需为每种Customer的子类都添加一个checkOut方法
    只需创建一个接收Customer的方法，就能适用于所有的子类
     */
    public void checkOut(Customer c){
        c.buy();
        c.pay();
        System.out.println("欢迎下次光临");
    }
}