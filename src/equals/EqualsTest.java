package equals;

public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("xiao ming", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("xiao ming", 75000, 1987, 12, 15);
        var bob = new Employee("xiao hong", 50000, 1989, 10, 1);

        System.out.println("(alice1 == alice2) = " + (alice1 == alice2));//true
        System.out.println("(alice1 == alice3) = " + (alice1 == alice3));//false
        System.out.println("alice1.equals(alice3) = " + alice1.equals(alice3));//true
        System.out.println("alice1.equals(bob) = " + alice1.equals(bob));//false
        System.out.println("bob.toString() = " + bob);

        System.out.println("alice1.hashCode() = " + alice1.hashCode());
        System.out.println("alice3.hashCode() = " + alice3.hashCode());
    }
}
