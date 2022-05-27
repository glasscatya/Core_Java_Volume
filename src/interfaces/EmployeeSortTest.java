package interfaces;

import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("xiao ming", 5000, 2000, 10, 12);
        staff[1] = new Employee("xiao ing", 500, 2000, 10, 12);
        staff[2] = new Employee("xiao ng", 50020, 2000, 10, 12);

        Arrays.sort(staff);
        for(Employee e : staff) {
            System.out.println("e.salary = " + e.getSalary());
        }

        String[] s = {"1293", "2pi12p", "213awwofidsaoiasdkh"};
        Arrays.sort(s, new LengthComparator());

        for (String s1:
             s) {
            System.out.println(s1);
        }
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
