package pair3;

import equals.Employee;
import equals.Manager;
//import inheritance.Manager;
import pair2.Pair;

public class PairTest3
{
    public static void main(String[] args)
    {
        var ceo = new Manager("xiao ming", 200000, 2003, 12, 3);
        var cfo = new Manager("xiao jun", 10000000, 2001, 11,22);
        var buddies = new Pair<> (ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(100000);
        cfo.setBonus(2000000);
        Manager[] managers = { ceo, cfo };

        var result =  new Pair<Employee>();
        minmaxBonus(managers, result);
        System.out.println("result.getSecond() = " + result.getSecond());
        maxminBonus(managers, result);
        System.out.println("result.getSecond() = " + result.getSecond());
    }

    public static void printBuddies(Pair<? extends Employee> p)
    {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + "are buddies");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
    {
        if(a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(min.getSonus() > a[i].getSonus()) min = a[i];
            if(max.getSonus() < a[i].getSonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxminBonus(Manager[] a, Pair<? super Manager> result)
    {
        minmaxBonus(a, result);
        new PairAlg().swap(result);
    }
}


class PairAlg
{
    public static boolean hasNulls(Pair<?> p)
    {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) { swapHelper(p); }

    public static <T> void swapHelper(Pair<T> p)
    {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}