package test1;

/**
 * 静态内部类
 *通过静态内部类创建单例
 *使用了类加载机制，不存在线程安全问题
 *只要不使用内部类那么就不会创建这个单例
 * 所以这种方式可以保证线程安全并且延迟加载
 */
public class Singleton4 {
    private static class SingletonStatic{
        public static Singleton4 singleton4=new Singleton4();
    }
    private Singleton4(){}
    private static Singleton4 getSingleton4(){
        return SingletonStatic.singleton4;
    }
}
