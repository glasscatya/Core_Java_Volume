package reflection;

import java.util.*;
import java.lang.reflect.*;


public class ReflectionTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        //读取想要查看类的名字
        String name;
        if(args.length > 0) name = args[0];
        else {
            var in = new Scanner(System.in);
            System.out.println("请输入class名(如: java.util.Date): ");
            name = in.next();
        }

        //打印class名和superclass名 （if ！= Object）
        Class cl = Class.forName(name);
        Class supercl = cl.getClass().getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if(modifiers.length() > 0) System.out.print(modifiers + " ");
        System.out.print("class " + name);
        if (supercl != null && supercl != Object.class) System.out.print(" extends " + supercl.getName());

        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }

    //打印构造器的方法
    public static void printConstructors(Class cl) {
//getDeclaredConstructors() 会获取当前类所有构造器数组
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c:constructors){
            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    //打印方法
    public static void printMethods(Class cl) {
        Method[] methods = cl.getMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");
            //
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    //打印字段
    public static void printFields(Class cl) {
        Field[] fields = cl.getFields();
        for(Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");

            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
