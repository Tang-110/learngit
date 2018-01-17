package crazyjava;

public class Type_Test {
    public static void main(String[] args) {
        String s="Hello";
        char c='c';
        int a=5;
        double d=.314;
        int m=(int)(Math.random()*2000);
        System.out.println(s+c+a);
        System.out.println(c+a+s);
        System.out.println(a+d);
        System.out.println(d+a);
        System.out.println(c+d+a+s);
        System.out.println(a+++6);
        System.out.println(m);
        System.out.println((Math.sqrt(5)*100));
        System.out.println(Math.pow(10,2));
        System.out.println(Math.sin(9));
    }
}
