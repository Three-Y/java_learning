package p174;

/**
 * 面向过程与面向对象
 * 面向过程(Procedure Oriented Programming)，强调功能行为，以函数为最小单位，考虑怎么做
 * 面向对象(Object Oriented Programming)，强调了具备某些功能的对象，以对象为最小单位，考虑谁来做
 * <p>
 * 面向对象三大特征
 * 封装、继承、多态
 * <p>
 * 类和对象
 * 类：抽象概念（人：属性：姓名、性别、年龄   行为：走路()、说话()、睡觉()、吃饭()）
 * 对象：类的实例（小明==>姓名：小明、性别：男、年龄：20   蹦蹦跳跳地走、大声说话、睡觉打呼噜、吃饭特别快）
 * <p>
 * 类的成员
 * 属性=成员变量=field=域=字段
 * 方法=成员方法=method=函数
 *
 * 每个对象都有自己的一套属性（非static），修改对象a不影响对象b
 */
public class P175_OOP {
    public static void main(String[] args) {
        //创建一个对象
        Person p = new Person();
        Person p2=new Person();

        //给对象属性赋值
        p.name="小明";
        p.sex="男";
        p.age=20;

        //调用对象的属性
        System.out.println(p.name+"的年龄是："+p.age);

        //调用对象的方法
        p.walk();
        p.talk("hello");

        //每个对象都有自己的一套属性（非static），修改对象a不影响对象b
        p2.name="小红";
        System.out.println("对象p的名字是"+p.name);
        System.out.println("对象p2的名字是"+p2.name);

        //将p1直接赋给p3，只是复制了对象的地址给p3，并没有真的在内存创建了一个对象给p3
        Person p3=p;
        p3.name="小白";
        System.out.println("修改p3后，对象p的名字是"+p.name);//p和p3指向同一个对象，修改p3其实就是修改p
    }
}

/*
设计一个类
 */
class Person {
    //属性
    String name;
    String sex;
    int age;

    //方法
    public void walk() {
        System.out.println("走路");
    }

    public void talk(String str) {
        System.out.println(str);
    }
}