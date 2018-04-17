package test1.abstractfactory;

/**
 * @author Tang
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个正方形产品");
    }
}
