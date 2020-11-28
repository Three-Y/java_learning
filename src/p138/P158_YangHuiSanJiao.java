package p138;

import java.util.*;

public class P158_YangHuiSanJiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入杨辉三角的行数：");
        int x = scanner.nextInt();
        int[][] arr=new int[x][x];
        int y=1;
        for(int i=0;i<x;i++){
            arr[1][i]=y;
            y++;
        }

    }
}
