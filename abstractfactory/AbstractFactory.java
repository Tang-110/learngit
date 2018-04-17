package test1.abstractfactory;

/**
 * 创建一个抽象工厂用于创建具体工厂
 * 写了Color接口和Shape接口的两个抽象方法，用于获取颜色和形状的参数
 * @author Tang
 */
public abstract class AbstractFactory {
    /**
     * @param color
     * @return
     * getColor()方法用于获取颜色参数
     */
    public abstract Color getColor(String color);

    /**
     * @param shape
     * @return
     * getShape()方法用于获取形状参数
     */
    public abstract Shape getShape(String shape);
}
