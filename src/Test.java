import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
//
//public class Test {
//    public static void main(String[] args){
//        int[] i = {1, 2, 3};
//        ArrTest(i);
//        System.out.println("i[0] = " + i[0]);
//    }
//
//    static int[] ArrTest(int[] i) {
//        i[0] = 10000;
//        return i;
//    }
//}




//class FileFormatException extends IOException {
//    public FileFormatException() {}
//
//    public FileFormatException(String gripe) {
//        super(gripe);
//
//    }
//}



import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("解析域名……");
        InetAddress inetAddress = InetAddress.getByName("www.hao123.com");
        System.out.println("网站地址为：" + inetAddress);
        System.out.println("尝试连接到主机……");
        Socket s = new Socket();
        SocketAddress sa = new InetSocketAddress(inetAddress, 80);
        s.connect(sa, 10000);
        System.out.println("已经连接到主机，开始模拟发送http请求……");

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), StandardCharsets.UTF_8));

        StringBuffer sb = new StringBuffer();
        // TODO 这是HTTP协议标准的请求头
        sb.append("GET /index.html HTTP/1.1\r\n");
        sb.append("Host: www.hao123.com\r\n");
        sb.append("Connection: Keep-Alive\r\n");
        sb.append("\r\n");
        pw.write(sb.toString());
        pw.flush();

        System.out.println("请求已经发送，开始读取主页内容……");

        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream(),
                StandardCharsets.UTF_8));

        reader.lines().forEach(System.out::println);

        // TODO 这个程序对很多技术上有高标准追求的网站都已经不能工作了。即使能工作，也不能正确完整的读取网页内容。
        // TODO 这里涉及到HTTP协议等内容，我们在这里就不详述了
        // TODO Java 有很多的HTTP库可以处理http客户端请求，我们这里只是处于学习的目的，大概了解
        // TODO 我很欣慰的看到网站已经都用了UTF-8了，乱码基本成为了历史
    }
}
