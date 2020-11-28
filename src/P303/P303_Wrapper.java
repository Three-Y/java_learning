package P303;

import org.junit.jupiter.api.Test;

/**
 * 包装类
 */
public class P303_Wrapper {

    @Test   //基本数据类型==>包装类
    public void test1() {
        Integer i1 = new Integer(12);
        Integer i2 = new Integer("12");
        //Integer i3 = new Integer("12abc");  //java.lang.NumberFormatException
        System.out.println(i1);
        System.out.println(i2);

        //Boolean有一点点特别
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("tRuE");   //不区分大小写
        Boolean b3 = new Boolean("abcd");   //不会抛异常，除了不区分大小写的true以外，其它非空字符串都当成false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3); //false
    }

    @Test   //包装类==>基本数据类型
    public void test2() {
        Double d1 = new Double(12.56);
        double d2 = d1.doubleValue();
        System.out.println(d1 + d2);  //25.12

        Float f1 = new Float("2.5");
        float f2 = f1.floatValue();
        System.out.println(f1 + f2);    //5.0
    }

    @Test   //JDK 5.0 增加的新特性：自动装箱和自动拆箱
    public void test3() {
        int i1 = 5;
        Integer i2 = i1;  //直接将一个基本数据类型赋值给包装类引用，自动装箱

        Double d1 = new Double(56.89);
        double d2 = d1;   //直接将一个包装类对象赋值给基本数据类型的变量，自动拆箱
    }

    @Test   //基本数据类型、包装类==>String
    public void test4() {
        float f1 = 10.5f;
        //方法一：字符串连接运算
        String s1 = f1 + "";
        //方法二：String.valueOf()
        String s2 = String.valueOf(f1);
        //包装类同理
        Double d1 = new Double(25.66);
        String s3 = d1 + "";
        String s4 = String.valueOf(d1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    @Test   //String==>基本数据类型、包装类
    public void test5() {
        String s1 = "123";
        int i1 = Integer.parseInt(s1);  //123
        double d1 = Double.parseDouble(s1); //123.0
        boolean b1 = Boolean.parseBoolean(s1);  //false
        boolean b2 = Boolean.parseBoolean("tRuE");  //true
        Integer i2 = Integer.parseInt(s1);  //123
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(i2);
    }

    @Test
    public  void test6(){
        Object o1 = true ? new Integer(1) : new Double(2.0);

        //Interger会被自动拆箱成int，然后三元运算符运算时会统一数据类型，又会将int自动类型提升成double进行运算
        System.out.println(o1); //1.0
        //最后会自动包装，将1.0包装成Double类型
        System.out.println(o1.getClass());  //class java.lang.Double

    }

    @Test
    public void test7() {
        /*
        因为new的是两个不同的对象，比较地址值肯定不一样
         */
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);   //false

        /*
        因为-128到127的Integer对象使用频繁，所以java提供了IntegerCache提前缓存了这些对象
        当要用到时直接从缓存中取，如果数值相同，取的其实就是同一个对象
         */
        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println(i3 == i4);   //true

        /*
        由于128超出了Integer的缓存范围，所以会重新new一个对象
        所以这是两个不同的对象
         */
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);   //false
    }
}