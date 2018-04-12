package test1;

/**
 * 双重校验锁
 *懒汉模式会造成性能问题
 * 双重校验锁解决了这一个问题
 * 但是同时又出现了指令重排优化的问题
 * 使用volatile关键字来解决这个问题
 * volatile禁止了指令重排优化
 */
public class Singleton3 {
    private static volatile Singleton3 singleton3=null;
    private Singleton3(){}
    private static Singleton3 getSingleton3(){
        if(singleton3==null){
            synchronized(Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
