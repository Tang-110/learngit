package crazyjava;

public class Test3 {
    public static void main(String[] args) {
        int age=45;
        if(age<20){
            System.out.println("少年人");
        }
        else if (age<40&&age>20){
            System.out.println("青年人");
        }
        else if (age>40&&age<60){
            System.out.println("中年人");
        }
        else{
            System.out.println("老年人");
        }
    }
}
