public class ParamTest {
        public static void main(String[] args) {
            String a = "111";
            String b = "222";
            value(a,b);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        static void value(String x, String y) {
            var temp = x;
            x = y;
            y = temp;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
}
