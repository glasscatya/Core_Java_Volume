package equals;
//import Pair;
public class Fanxing {
    public static void main(String[] args) {
        var managerBuddies = new Pair<Manager>(new Manager("xiao hong", 50000, 1989, 10, 1), new Manager("xiao hong", 50000, 1989, 10, 1));
        Pair<?> employeeBuddies = managerBuddies;    // 原型是可以成功转型的
//        employeeBuddies.setFirst("S"); //这里会抛出ClassCastExcption
//        System.out.println(employeeBuddies.getFirst());
        employeeBuddies.setFirst(null);
        boolean t = employeeBuddies.getFirst() == null;
        System.out.println("t = " + t);
        Object a = employeeBuddies.getFirst();
        var ma = new Manager("xiao hong", 50000, 1989, 10, 1);
//        ma = (Manager) employeeBuddies.getFirst();
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

