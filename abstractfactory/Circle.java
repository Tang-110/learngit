package test1.abstractfactory;

/**
 * @author Tang
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个圆形产品");
    }
}
