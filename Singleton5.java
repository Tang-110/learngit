package test1;

/**
 * 枚举
 * 可以保证线程安全和防止反射调用构造器
 * 提供了自动序列化机制，防止反序列化的时候创建新的对象
 */
public enum  Singleton5 {
    singleton5;
    public void test(){

    }
}
