package model;

import java.io.Serializable;

@Deprecated
public class MyClass implements Serializable {

    public int x;
    private String y;

    public MyClass() {
    }

    private MyClass(int z) {
        x = z;
    }

    public int f(int x) {
        return x * x;
    }

    private int g(int x) {
        return x + x;
    }
}
