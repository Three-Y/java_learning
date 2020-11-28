package P221;

/**
 * 构造器
 *
 * 构造器的作用：创建对象、初始化对象的属性
 *
 * 定义构造器的格式：权限修饰符 类名(参数列表){}
 *
 * 说明：
 * 构造方法名与类名相同
 * 若没有显示声明构造器，系统默认提供一个无参构造器
 * 若有显示声明构造器（无论是否有参），则不再提供无参构造器
 * 可以定义多个构造器(构造器重载)
 *
 * 给属性赋值的先后顺序：默认初始化==>显式初始化==>构造器赋值==>“对象.属性”或对象方法赋值
 */
public class P224_Constructor {
    C c = new C();//C类中什么都没有，但是也能调用构造器方法，系统默认提供一个无参构造器

    //A a=new A();//A类中声明了一个有参的构造器，系统不再提供无参构造器
    A a = new A(123);

    //B中有多个构造器
    B b1 = new B();
    B b2 = new B(123);
}

class C{
    //什么也没有
}

class A{
    //一个有参的构造器
    public A(int i){}
}

class B{
    //定义多个构造器
    public B(){}
    public B(int i){}
}