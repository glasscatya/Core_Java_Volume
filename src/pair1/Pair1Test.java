package pair1;

import java.lang.reflect.*;

public class Pair1Test {
    public static void main(String[] args) {
        String[] a = {"小王", "xiaolli", "xiaozhao"};
        double middle = ArrayAlg.getMiddle(100.0, 233.0, 455.0, 42.2, 3.14);
        Pair<String> pair = ArrayAlg.minmax(a);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(middle);
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if(a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    @SafeVarargs
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair() { first = null; second = null; }
    public Pair(T first, T second) { this.first = first; this.second = second; }

    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
}
