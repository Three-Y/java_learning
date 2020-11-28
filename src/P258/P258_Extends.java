package P258;

/**
 * 继承：
 *      人类又可以分学生、教师、程序员。。。
 *      学生、教师等都具有人类的属性和功能，如果每次新建一个类，都将人类的功能写一遍，会产生代码的冗余
 *      因此产生了"继承"，只有学生类、教师类都继承人类，就可以具有人类的属性和功能，再在自己的类中添加自己特有的东西即可
 * 作用：
 *      减少代码冗余
 *      提高代码复用性
 *      便于功能扩展
 *
 * 父类、超类、基类、superclass（如：人类）
 * 子类、派生类、subclass（如：学生、教师、程序员）
 *
 *  格式：class A extends B{}
 *
 *  子类继承父类后：
 *      子类就拥有了父类声明的所有结构，包括私有的结构，只是私有结构不能直接调用
 *      子类可以在父类的基础上实现功能的扩展
 *
 *  规定：
 *      一个子类只有一个父类
 *      一个父类可以有多个子类
 *      可以多层继承
 *      子类和父类是相对概念
 *      子类可以获取直接父类和所有间接父类的结构
 *
 *  所有的类都有一个共同的父类java.lang.Object
 */
public class P258_Extends {
    public static void main(String[] args) {

        //子类Teacher可以调用父类Person的方法和属性
        Teacher t = new Teacher();
        t.eat();
        t.sleep();
        System.out.println(t.name);

        //子类调用自己的方法和属性
        t.teach();
        System.out.println(t.phone);

        //调用Object的方法
        System.out.println(t.toString());
    }
}

class Person{
    int age;
    String name;

    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }
}

class Teacher extends Person{

    String phone;   //在父类的基础上扩展属性

    //在父类的基础上扩展功能
    public void teach(){
        System.out.println("教书");
    }
}