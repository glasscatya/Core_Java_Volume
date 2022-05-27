import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
//                var text = new Text();

        var staff = new ArrayList<Employee>();
        staff.add(new Employee("22xiao ming", 75000, 1987, 12, 12));
        staff.add(new Employee("xiao ming", 75000, 1987, 12, 12));
        staff.add(new Employee("xiao ming", 75000, 1987, 12, 12));
//
        for(Employee e : staff) {
            e.raiseSalary(5);
        }
//为

        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",id = ");
        }
    }
}
