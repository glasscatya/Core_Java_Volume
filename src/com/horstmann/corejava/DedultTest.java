package com.horstmann.corejava;

import java.lang.reflect.Field;

public class DedultTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        var harry = new Employee("Harry Hacker", 50000, 1949, 10, 1);
//        System.out.println("em.a = " + em.a);
        Class cl = harry.getClass();
//        这里的f 是拿到了类的字段 而不是拿到了实例的字段，所以在下面使用get方法，需要先指明是哪一个实例。
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println("f.get(harry) = " + f.get(harry));
    }
}
