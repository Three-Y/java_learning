package P258;

/**
 * super关键字
 * 在子类中可以通过super调用父类的结构
 *
 *
 * super.属性
 *      属性没有覆盖一说，父类的属性不会被子类声明的相同的属性覆盖
 *      若父类和子类声明了同名的属性，在子类调用父类的属性需要使用super
 *
 * super.方法
 *      若子类重写的方法不想完全覆盖父类的方法，只想直接使用父类的方法，或者只想在父类的基础上增加一点功能，可以使用super调用父类的方法
 *
 * super()
 *      可以在子类的构造器中使用super()调用父类的构造器
 *      super()必须在子类当前构造器的首行
 *      this()与super()不能同时出现在子类的同一构造器中
 *      子类构造器中其实全部都默认调用了super(空参)
 *      如果父类没有空参构造器，子类的构造器如果没有显式调用父类的其它构造器，会报错
 *      类的多个构造器中，最少有一个类调用了父类的构造器
 *
 * 对象实例化的过程中
 *      一定会直接或间接调用了父类的某个构造器，所以子类中才能具有父类的结构
 *      注意：尽管调用了父类的构造器，内存中还是只有一个对象而已
 *
 */
public class P274_Super {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        C c = new C();
        c.show();
    }
}

class A {
    int a = 1;
    int c = 3;

    public A(){
        System.out.println("我是A类");
    }

//    public A(int a){
//        this.a = a;
//        System.out.println("我是A");
//    }
}

class B extends A {
    int b = 2;
    int c = 33;

    /*
    若父类没有提供空参的构造器，子类的构造器中首行都是默认调用父类空参构造器的，子类就会报错
    此时需要显式在子类构造器中调用父类的构造器，或者在父类中添加空参的构造器
     */
//    public B(int a) {
//        super(a);
//    }

    public void show() {
        System.out.println("用this调用只有父类声明的属性a：" + this.a);
        System.out.println("用this调用只有子类声明的属性b：" + this.b);
        System.out.println("用this调用父类和子类都有声明的属性c：" + this.c);
        System.out.println("用super调用只有父类声明的属性a：" + super.a);
        //System.out.println("用super调用只有子类声明的属性b：")+super.b;  //父类中没有属性b，无法调用
        System.out.println("用super调用父类和子类都有声明的属性c：" + super.c);
    }
}

class C extends B {
    int c = 66;

    @Override
    public void show() {
        super.show();   //调用父类的方法
        System.out.println("在c中使用super调用三个类都有声明的属性c："+super.c);
    }
}