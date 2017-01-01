// 编写java程序，使用InetAddress类实现根据域名自动到DNS（域名服务器）上查找IP地址的功能
import java.io.*;
import java.net.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dns = bufferedReader.readLine();
        bufferedReader.close();
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName(dns);
            System.out.println(inetAddress.getHostAddress());
        } catch {
            System.out.println("Your Input Domin Can't Parse.");
        }
    }
}