import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.*;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test
{
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("makePair(Employee.class).toString() = " + makePair(Employee.class).toString());


    }

    public static <T> Pair<T> makePair(Class<T> c) throws
            InstantiationException, IllegalAccessException {
        return new Pair<>(c.newInstance(), c.newInstance());
    }
}


class DateInterval extends Pair<LocalDate> {
    public void setSecond(LocalDate second) {
        if(second.compareTo(getFirst()) >= 0)
            super.setSecond(second);

    }
}




