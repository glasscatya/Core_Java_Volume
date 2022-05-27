package abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];
        people[0] = new Employee("xiao ming", 50000, 1999, 10, 1);
        people[1] = new Student("xiao jun", "Computer science");

        for(Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
