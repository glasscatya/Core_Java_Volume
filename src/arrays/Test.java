package arrays;
import com.horstmann.corejava.Employee;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var a = new Employee[3];
        a[0] = new Employee("0", 50000, 1949, 10, 1);
        a[1] = new Employee("1", 50000, 1949, 10, 1);
        a[2] = new Employee("2", 50000, 1949, 10, 1);
//        a = (Employee[]) goodCopyOf(a, 9);
//        System.out.println("Array.getLength(a) = " + Array.getLength(a));
//        for(Employee e : a) {
//            if(e == null) continue;
//            System.out.println(e.getNam());
//        }
/*
*       先获得Class类 然后再获得Class类中的方法、字段
*       Field 可以使用 get方法去查看
*       Method 也可以用 invoke 方法去使用
* */
        Method m1 = Employee.class.getMethod("getNam");
        String n = (String) m1.invoke(a[2]);
        System.out.println("n = " + n);
    }

    static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if(!cl.isArray()) return null;
//      使用Array上的方法 是因为不能保证传进来的数组 写了Length方法
//        int len = a.length();
        int len = Array.getLength(a);
        Object newArray = Array.newInstance(cl.getComponentType(), newLength);
//        5个参数，
//
//        第一个参数是要被复制的数组
//        第二个参数是被复制的数字开始复制的下标
//        第三个参数是目标数组，也就是要把数据放进来的数组
//        第四个参数是从目标数据第几个下标开始放入数据
//        第五个参数表示从被复制的数组中拿几个数值放到目标数组中
        System.arraycopy(a, 0, newArray, 0, Math.min(len, newLength));
        return newArray;
    }
}
