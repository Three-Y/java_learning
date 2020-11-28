package p174;

/**
 * 方法的声明
 *      权限修饰符 返回值类型 方法名(形参列表){方法体}
 *
 * 权限修饰符：public、private、protected、缺省
 *
 * 返回值类型（可无返回值）
 *      有返回值：①声明返回值的类型 ②方法体中使用return关键字返回
 *               假如方法体中有判断语句，要确保每种情况都有return返回，否则报错
 *      无返回值：用void表示，不需要return
 *               但是必要时方法体仍然可以使用return
 *
 * 方法名：见名知意，小驼峰命名
 *
 * 形参列表（可空）
 *      可以有0或1或多个形参
 *      格式：参数类型1 形参1,参数类型2 形参2,...
 */

public class P185_DeclarationMethod {

}

class student{
    String name;
    int age;

    public void sleep(){//无返回值无形参
        System.out.println("睡觉");
    }

    public String getName(){//有返回值
        return name;//使用return进行返回
    }

    public void talk(String str){//有形参，形参格式：参数类型 参数名
        System.out.println(name+str);
    }

    public String checkAge(){//确保每种情况都能得到返回值
        if(age>=18){
            return "我已成年";
        }else {
            return "我未成年";
        }
    }

}
