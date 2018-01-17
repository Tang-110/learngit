package crazyjava;

public class TestUpDate {
    public static void main(String[] args) {
        printTiangle_1(5);
        System.out.println("________________");
        printTiangle_2(5);
        System.out.println("________________");
        printTiangle_3(5);
    }

    public static void printTiangle_1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTiangle_2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTiangle_3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
