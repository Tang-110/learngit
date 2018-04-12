package test1;

/**
 * 饿汉模式
 * 在类加载的时候就创建一个实例
 * 创建了一个静态实例，然后通过一个静态方法来返回它给使用者
 * 构造方法用private修饰，其他类就不能实例化本类
 * 好处是只在类加载的时候创建一次实例，但是同时也是坏处，那就是就算这个实例不会被用到也会被加载
 */
public class Singleton1 {
    private static Singleton1 singleton= new Singleton1();

    private Singleton1(){}

    private static Singleton1 init(){
        return singleton;
    }
}
