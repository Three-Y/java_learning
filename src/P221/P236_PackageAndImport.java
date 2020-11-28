package P221;
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * package关键字
 *      作用：更好地进行类管理
 *      规则：package 包名;
 *           声明在源文件首行
 *           包名属于标识符，遵循标识符的命名规则，见名知意（如：xxx.xxx.xxx）
 *           每"."一次代表一层文件夹
 *      注意：同一个包下不能有同名类、接口
 *
 * import关键字
 *      作用：简化代码，提高代码可读性，无需处处都使用完整类名（全类名：xxx.xxx.xxx.classname）
 *      规则：import 完整类名或接口名
 *           声明在package和类之间
 *           可使用xxx.*表示xxx包下的所有类，不包括xxx的子包（如：import java.util.*;//表示导入java.util下的所有类、接口）
 *           可使用import static调用某类的静态结构（如：import static java.lang.System.*;）
 *      注意：java的核心类（java.lang包下的类）无需导入即可使用
 *           当前包下的类或接口也无需导入即可使用
 *           若同时使用不同包下的同名类，只能import其中一个，另外一个要使用完整类名调用，或两个都使用完整类名调用
 */
public class P236_PackageAndImport {
    public static void main(String[] args) {
        /*
        因为有import static java.lang.System.*;
        所以可以省略System
         */
        System.out.println("test");
        out.println("test");
        /*
        因为有import static java.lang.Math.*;
        所以可以省略Math
         */
        int a1 = Math.abs(-5);
        int a2 = abs(-5);
        out.println("a1="+a1);
        out.println("a2="+a2);
    }
}
