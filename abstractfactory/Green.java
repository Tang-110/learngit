package test1.abstractfactory;
/**
 * 重写颜色接口方法fill（）并具体实现
 * @author Tang
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("生产了一个绿色产品");
    }
}
