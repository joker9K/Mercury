package main.test;


import java.io.IOException;
import java.net.*;
import java.util.Enumeration;

/**
 * Created by zhangwt on 2017/5/3.
 */
public class Test9 {

    public static void main(String[] args) {
//        try {
//            Enumeration e = null;
//            try {
//                e = NetworkInterface.getNetworkInterfaces();
//            } catch (SocketException e1) {
//                e1.printStackTrace();
//            }
//            while(e.hasMoreElements())
//            {
//                NetworkInterface n = (NetworkInterface) e.nextElement();
//                Enumeration ee = n.getInetAddresses();
//                while (ee.hasMoreElements())
//                {
//                    InetAddress i = (InetAddress) ee.nextElement();
//                    System.out.println(i.getHostAddress());
//                }
//            }

        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("www.baidu.com", 80));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(socket.getLocalAddress());


//            InetAddress address = InetAddress.getLocalHost();//获取的是本地的IP地址 //PC-20140317PXKX/192.168.0.121
//            System.out.println(address.getHostName());
//            String hostAddress = address.getHostAddress();//192.168.0.121
//            InetAddress address1 = InetAddress.getByName("www.wodexiangce.cn");//获取的是该网站的ip地址，比如我们所有的请求都通过nginx的，所以这里获取到的其实是nginx服务器的IP地
//            String hostAddress1 = address1.getHostAddress();//124.237.121.122
//            InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");//根据主机名返回其可能的所有InetAddress对象
//            for(InetAddress addr:addresses){
//                System.out.println(addr);//www.baidu.com/14.215.177.38
//                //www.baidu.com/14.215.177.37
//            }
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
    }
}
