package P258;

import java.util.Date;

/**
 * java.lang.Object
 *      所有Java类的根父类
 *      Object类只有一个空参构造器
 *      无属性
 * 常用方法：toString(),equals(),hashCode(),getClass()
 *
 * ==与equals()的区别
 *      ==：是一个运算符
 *          用于基本数据类型和引用数据类型的比较
 *          如果比较的是基本数据类型，比较的是变量的数值
 *          如果比较的是引用数据据类型，比较的是地址值（此时变量装的是所引用对象的地址值）
 *      equals()：是一个方法
 *                只能适用于引用数据类型
 *                注意：
 *                  在Object类中，equals()的作用与==相同的，比较的是地址值
 *                  在某些类中，如String、Date、File、包装类等，重写了Object的equals()，比较的不再是地址值，而是对象实体的内容
 * 重写equals()的原则：
 *      对称性：x.equals(y)=true 则 y.equals(x)=true
 *      自反性：x.equals(x)必须是true
 *      传递性：x.equals(y)=true 且 y.equals(z)=true 则 x.equals(z)=true
 *      一致性：x.equals(y)=true 只要x和y内容不变，执行多少次都是true
 *      任何情况下，x.equals(null)=false
 *      任何情况下，x.equals(与x不同类型的对象)=false
 *
 *  toString()
 *      当我们使用System.out.println(某对象)的时候，其实是调用了此对象的toString()
 *      Object中的toString()如下:
 *          public String toString() {
 *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *          }
 *
 *      String、Date、File、包装类等，重写了Object的toString()
 */
public class P292_Object {
    public static void main(String[] args) {
//        Object o = new Object();
//        o.equals(new Object());
//        o.toString();
//        o.hashCode();
//        o.getClass();

        //使用 == 比较基本数据类型
        System.out.println("*************使用 == 的比较*************");
        int i = 10;
        int j = 10;
        double k = 10.0;
        char c = 10;
        boolean m = true;
        System.out.println(i == j);//true
        System.out.println(i == k);//true
        System.out.println(i == c);//true
        //System.out.println(i==m);//只有boolean类型不能比较

        //使用 == 比较引用数据类型
        String s1 = new String();
        String s2 = new String();
        AA aa1 = new AA(1,"哈哈");
        AA aa2 = new AA(1,"哈哈");
        System.out.println(s1 == s2);//false
        System.out.println(aa1 == aa2);//false

        //使用 equals()
        System.out.println("*************使用 equals() 的比较*************");
        System.out.println(aa1.equals(aa2));//false 重写AA的equals()后：true
        System.out.println(aa2.equals(aa1));//false 重写AA的equals()后：true
        System.out.println(s1.equals(s2));//true，String中重写了Object的equals()，比较的是对象实体的内容
        System.out.println(s2.equals(s1));//true，String中重写了Object的equals()，比较的是对象实体的内容

        //toString()
        System.out.println(aa1.toString()); //P258.AA@1b6d3586
        System.out.println(aa1);            //P258.AA@1b6d3586

        //String、Date、File、包装类等，重写了Object的toString()
        Date date = new Date(21554236985L);
        System.out.println(date.toString());    //Mon Sep 07 19:17:16 CST 1970
        System.out.println(date);               //Mon Sep 07 19:17:16 CST 1970

        //重写AA的toString后
        System.out.println(aa2);    //AA[a=1, str=哈哈]
    }
}

class AA{
    int a;
    String str;

    public AA(int a,String str){

        this.a = a;
        this.str=str;
    }

    //用IDE的工具生成的equals重写方法，比较的是对象的内容
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AA aa = (AA) o;
//        return a == aa.a;
//    }

    //手动重写equals()，改成比较内容
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof AA) {
            AA aa = (AA) obj;
            /*
            基本数据类型则用“==”进行比较
            引用数据类型需要调用equals()进行比较
            如果比较的是自定义的引用数据类型，比较的类型的equals()也要重写
             */
            return this.a == aa.a && this.str.equals(aa.str);
        }
        return false;
    }

    //用IDE工具生成的toString重写方法
//    @Override
//    public String toString() {
//        return "AA{" +
//                "a=" + a +
//                ", str='" + str + '\'' +
//                '}';
//    }

    //手动重写toString

    @Override
    public String toString() {
        return "AA[a=" + a + ", str=" + str + "]";
    }
}
