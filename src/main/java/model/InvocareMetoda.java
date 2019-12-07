package model;

import java.lang.reflect.Method;

public class InvocareMetoda {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();

        System.out.println(myClass.f(2));

        Method method = MyClass.class.getDeclaredMethod("g", int.class);
        method.setAccessible(true);
        Object result = method.invoke(myClass,3);
        System.out.println(result);
    }
}
