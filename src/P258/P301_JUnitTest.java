package P258;

import org.junit.jupiter.api.Test;  //导入了junit的包，在项目的Libraries中可以看到JUnit的Module

public class P301_JUnitTest {

    int i=100;

    @Test   //添加了@Test注解
    public void test1(){
        System.out.println(i);
        System.out.println("test1");
        test2();
    }

    @Test   //想test哪里就在哪个方法的方法名上点击运行
    public void test2(){
        System.out.println("test2");
    }
}
