package crazyjava;

import java.util.Scanner;

public class Test1_UpDate {
    public static void main(String[] args) {
        Scanner scanId = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String id = scanId.nextLine();
        if (id.length() != 18) {
            System.out.println("身份证号的位数为18，请输入合法的身份证号：");
            String id2 = scanId.nextLine();
            if (id2.length() == 18) {
                System.out.println("你的身份证号输入正确，身份证号为：" + id2);
            } else {
                System.out.println("你的输入不合法！");
            }
        } else {
            System.out.println("你的身份证号输入正确，身份证号为：" + id);
        }
    }
}
