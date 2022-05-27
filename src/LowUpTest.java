import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class LowUpTest {
    /**
     * Learn Java from https://www.liaoxuefeng.com/
     *
     * @author liaoxuefeng
     */

        public static void main(String[] args) {
            String[] array = new String[] { "apple", "Orange", "banana", "Lemon" };
            // 请使用忽略大小写排序，并改写为Lambda表达式:
            Arrays.sort(array, Comparator.comparing(String::toLowerCase));
            System.out.println(String.join(", ", array));
        }
}
