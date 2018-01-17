package crazyjava.annotation_test;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        Class<Student> c=Student.class;
        Annot annotation=c.getAnnotation(Annot.class);
        if(annotation!=null){
            String name=annotation.name();
            int age=annotation.age();
            Student str=c.newInstance();
            Method nameMethod=c.getMethod("setName", String.class);
            Method ageMethod=c.getMethod("setAge", int.class);
            nameMethod.invoke(str,name);
            ageMethod.invoke(str,age);
            System.out.println(str);
        }
    }
}
