package crazyjava.annotation_test;
@Annot
public class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "{name:"+name+" age:"+age+"}";
    }
}
