package P221;

/**
 * this关键字
 *
 * this表示当前对象
 *
 * 类中可以使用：
 *      this                  表示当前对象（例如：A类中某方法需要传递当前A对象，则可以使用this）
 *      this.属性             表示当前对象的属性
 *      this.方法             表示当前对象的方法
 *      this(构造器所需参数)   表示当前对象的构造器
 *
 * 一般情况下省略this，特殊情况，方法的形参与类属性同名，用this区分开
 *
 * this(构造器所需参数)
 *      只能在构造器中使用
 *      构造器的调用必须放在当前构造器的第一行
 *      一个构造器中只能调用一个构造器
 *      不能自己调自己
 *      构造器之间的调用不能形成环(A->B->C->A)
 */
public class P231_This {
    public static void main(String[] args) {
        Cat c = new Cat("傻猫");
        System.out.println(c.age);
    }
}

class Cat{
    String name;
    int age;

    /*
        假如对象初始化时，需要有某些操作
        对象有多个构造器，如果每个构造器重复写同样的代码，效率太低
        可以将重复的代码写在某个构造器中，在别的构造器中使用"this.构造器"调用
         */
    public Cat(int age) {
        this("傻逼");//调用有参的构造器
        this.age = age;
        //this();//构造器必须在第一行
    }

    public Cat(String name) {
        this();         //调用无参的构造器
        //this(1);      //最多只能调用一个构造器，因为构造器必须在第一行
        this.name = name;
    }

    public Cat(){
        //this(1);  //构造器之间的调用不能形成环(Cat(int age) ====> Cat(String name) ====> Cat() ==X==> Cat(int age))
        System.out.println("一只傻猫正向你冲过来");
    }

    public void setName(String name) {
        //name = name;//形参名与属性名相同，此处的name都是形参，并没有成功给属性name赋值
        this.name = name;//使用this.name，区分开属性的name和形参name
    }

    public String getName(){
        //使用this.属性 调用当前对象的属性
        return this.name ;
    }

    public void eat(){
        //使用this.方法 调用当前对象的方法
        System.out.println(this.getName()+"在吃东西");
    }
}