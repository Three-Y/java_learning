package P221;

/**
 * 权限修饰符
 *
 * 四种权限修改符（从小到大）：private、缺省、protected、public
 *      private：类内部
 *      缺省：类内部、同一个包
 *      protected：类内部、同一个包、不同包的子类
 *      public：类内部、同一个包、不同包的子类、同一个工程
 *
 * 使用范围：
 *      属性、方法、构造器、内部类可以使用四种权限修饰符
 *      类只能使用缺省、public
 */

//类可以使用public修饰符
public class P221_AccessModifier {
    public static void main(String[] args) {
        AMTest amt = new AMTest();

        //int a = amt.AMPrivate;//同一个包，不能调用AMTest中private的属性
        int b = amt.AMDefault;
        int c = amt.AMProtected;
        int d = amt.AMPublic;

        //amt.privateAM();//同一个包，不能调用AMTest中private的方法
        amt.defaultAM();
        amt.protectedAM();
        amt.publicAM();
    }
}

//类可以使用缺省修饰符
class AMTest{
    //属性使用四种权限修饰符
    private int AMPrivate;
    int AMDefault;
    protected int AMProtected;
    public  int AMPublic;

    /*
    使用四种权限修饰符的方法
     */
    private void privateAM() {
        //类内部，所有属性都可调用
        int a = AMPrivate;
        int b = AMDefault;
        int c = AMProtected;
        int d = AMPublic;
        //类内部，所有方法都可调用
        privateAM();
        defaultAM();
        protectedAM();
        publicAM();
    }
    void defaultAM(){

    }
    protected void protectedAM(){

    }
    public void publicAM(){

    }
}

class AMTestSon extends AMTest{

}

//类不可以使用private修饰符
//private class AMTest1{//modifier 'private' not allowed here
//
//}

//类不可以使用protected修饰符
//protected class AMTest1{//modifier 'protected' not allowed here
//
//}