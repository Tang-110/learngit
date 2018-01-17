package crazyjava;

public class Test {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){//i表示行数
            for(int k=1;k<=4-i;k++)//k表示当前行打印的空个数
                System.out.print(" ");//如果把print写成println是无法打印出三角图形的
            for(int j=1;j<=2*i-1;j++)//j表示当前打印的*数
                System.out.print("*");//如果把print写成println是无法打印出三角图形的
            System.out.println();//换行
        }
    }
}

