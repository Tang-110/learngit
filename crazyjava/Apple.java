package crazyjava;

public class Apple<T> {
    private T info;
    public Apple(T _info){
        this.info=_info;
    }
    public void setInfo(T _info){
        this.info=_info;
    }
    public T getInfo(){
        return this.info;
    }

    public static void main(String[] args) {
        Apple<Double> d1=new Apple<Double>(456.3);
        System.out.println(d1);
    }
}
