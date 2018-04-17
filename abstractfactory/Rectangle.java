package test1.abstractfactory;

/**
 * @author Tang
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个长方形产品");
    }
}
