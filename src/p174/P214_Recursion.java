package p174;

/**
 * 递归
 *
 * 某个过程由多个重复的相同步骤组成
 * 将这个步骤写成一个方法
 * 方法自己调用自己，达到某个条件后逐步返回结果
 */
public class P214_Recursion {
    public static void main(String[] args) {
        P214_Recursion p = new P214_Recursion();
        //给定一个数n，求n+(n-1)+(n-2)+...+1
        System.out.println("循环的方法："+p.getSum1(100));
        System.out.println("递归的方法："+p.getSum1(100));

        //一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),给定一个n，求f(n)
        System.out.println(p.f(5));

        //斐波那契数列
        long n = 20;
        for (long i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(p.m(i));
            } else {
                System.out.print(p.m(i) + ",");
            }
        }
    }

    //循环的方法
    public long getSum1(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /*
    递归的方法
    给定一个数n，求n+(n-1)+(n-2)+...+1
    不停重复n+n-1这个步骤
    开始返回的条件是n=1
     */
    public long getSum2(long n) {
        if (n == 1) {//开始返回的条件
            return 1;
        } else {
            return n + getSum2(n - 1);//自己调用自己
        }
    }

    /*
    递归
    问题：一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),给定一个n，求f(n)
     */
    public long f(long n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    /*
    递归
    斐波那契数列：1,1,2,3,5,8...一个数等于前两个数之和
     */
    public long m(long n) {
        if (n == 1 | n == 2) {
            return 1;
        } else {
            return m(n - 1) + m(n - 2);
        }
    }
}
