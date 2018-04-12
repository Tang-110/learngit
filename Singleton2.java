package test1;

/**
 * 懒汉模式
 * 是在我们需要创建实例的时候才创建这个单例
 *懒汉模式存在线程安全的问题，所以我们通过加锁解决这个问题
 * 但是因为加锁造成了性能问题，所以这个方式并不完美
 */
public class Singleton2 {
    private static Singleton2 singleton2=null;
    private Singleton2(){}
    private static synchronized Singleton2 getSingleton2(){
        if(singleton2==null){
            singleton2=new Singleton2();
        }
        return singleton2;
    }
}
