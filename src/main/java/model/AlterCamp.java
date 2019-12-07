package model;

import java.lang.reflect.Field;

public class AlterCamp {
    public static void main(String[] args) throws Exception {

        MyClass myClass = new MyClass();
        System.out.println(myClass.x);

        Field field = MyClass.class.getDeclaredField("x");
        Object v1 = field.get(myClass);
        field.set(myClass, 10);
        Object v2 = field.get(myClass);

        System.out.println("V1 = " + v1);
        System.out.println("V2 = " + v2);
    }
}
