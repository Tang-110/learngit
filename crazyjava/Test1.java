package crazyjava;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanId=new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String id=scanId.nextLine();
        System.out.println("你的身份证位数为：");
        System.out.println(id.length());
    }
}
