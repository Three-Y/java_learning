package p174;

/**
 * 匿名对象
 * 没有显式地赋给一个变量名的对象
 * 因为没有名字，所以只能创建对象时调用一次，后面就取不到了
 */
public class P201_AnonymousObject {
    public static void main(String[] args) {

        //new对象不赋予变量名，直接调用，是两个不同的phone对象
        new Phone().talk();
        new Phone().talk();

        //传递参数时直接new一个对象
        PhoneMall phoneMall = new PhoneMall();
        phoneMall.showThePhone(new Phone());

    }
}

class PhoneMall{
    public void showThePhone(Phone p){
        p.talk();
        p.playGame();
    }
}

class Phone{
    public void talk(){
        System.out.println(this.hashCode()+" talk");
    }
    public void playGame(){
        System.out.println(this.hashCode()+" play game");
    }
}
