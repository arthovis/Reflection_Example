package model;

import java.lang.reflect.Field;

public class Introspectie {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        Class<? extends MyClass> c1 = myClass.getClass();
        Class<MyClass> c2 = MyClass.class;
        Class<?> c3 = Class.forName("model.MyClass");

        System.out.println("Varianta 1: " + c1);
        System.out.println("Varianta 2: " + c2);
        System.out.println("Varianta 3; " + c3);

        System.out.println(c1.getAnnotations()[0]);

        for (Field field : c1.getFields()) {
            System.out.println("Fielduri publice: " + field);
        }

        for (Field field : c1.getDeclaredFields()) {
            System.out.println("Field-uri declarate (publice+private): " + field);
        }
    }
}
