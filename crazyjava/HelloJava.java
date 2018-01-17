package crazyjava;
class Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name){
        this.name=name;
    }
}
public class HelloJava {

    public static void main(String[] args) {
        Person p=new Person("JACK");
        //String name="Jack";
        System.out.println(p.getName()+"!你好!");
    }
}
