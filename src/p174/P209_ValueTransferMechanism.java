package p174;

/**
 * 值传递机制
 *
 * 如果变量是基本数据类型，直接传具体的数据值
 * 如果变量是引用数据类型，传递的只是引用（地址值）
 */
public class P209_ValueTransferMechanism {
    public static void main(String[] args) {
        int i = 1;
        int j = i;
        System.out.println("i = " + i + " ; j = " + j);

        /*
        堆中只有一个String对象
        s1和s2指向的是同一个String对象
         */
        String s1 = new String("啦啦啦");
        String s2 = s1;
        System.out.println("s1:"+s1.hashCode());//s1:21708966
        System.out.println("s2:"+s2.hashCode());//s2:21708966

        i = 5;
        j = 10;
        System.out.println("转换前：i = "+i+"; j = "+j);//转换前：i = 5; j = 10
        new VT().swap(i, j);
        System.out.println("转换后：i = "+i+"; j = "+j);//转换后：i = 5; j = 10

        Cat c= new Cat("傻猫");
        System.out.println("执行前c的名字是 "+c.name);//执行前c的名字是 傻猫
        new VT().changeObject(c);
        System.out.println("执行后c的名字是 "+c.name);//执行后c的名字是 蠢猫
    }
}

class VT{

    String name;

    //此处的i和j不是调用处的i和j，只是这里的局部变量
    //方法执行完后，此处的局部变量也一起出栈了，不会影响到调用处的i和j
    public void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    //调用处传递的是对象的地址值，此处的c与调用处的c指向的是同一个对象
    //在此次修改对象，修改的也是调用处的对象，调用处能看到对象发生变化
    public void changeObject(Cat c){
        c.name="蠢猫";
    }
}

class Cat{
    String name;

    public Cat(String name){
        this.name = name;
    }
}