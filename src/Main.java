import com.horstmann.corejava.Employee;

public class Main {
    public static void main(String[] args) {
//        String a = "111";
//        String b = "222";
////        int a = 1;
////        int b = 2;
//        value(a,b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        var p = new Person(10);
        value(p);
        System.out.println("p.getAge() = " + p.getAge());

    }

    static void value(Person x) {
//        var temp = x;
//        x = y;
//        y = temp;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println(x);
        x.setAge(100);
    }
}

final class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

