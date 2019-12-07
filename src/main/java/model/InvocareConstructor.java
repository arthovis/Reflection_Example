package model;

import java.lang.reflect.Constructor;

public class InvocareConstructor {

    public static void main(String[] args) throws Exception {

        Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        MyClass myClass = constructor.newInstance(3);
        System.out.println(myClass);
    }
}
