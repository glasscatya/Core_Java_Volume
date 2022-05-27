import com.horstmann.corejava.*;
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        var harry = new Employee("Harry Hacker", 50000, 1949, 10, 1);
        harry.raiseSalary(10);

        out.println("name = " + harry.getName());
    }
}
