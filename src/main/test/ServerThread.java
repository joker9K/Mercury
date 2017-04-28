package main.test;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.Socket;
/**
 * Created by zhangwt on 2017/4/19.
 */


//import java.text.DecimalFormat;

public class ServerThread extends Thread{
    //和本线程相关的Socket
    Socket socket =null;
    //private static final int DATA_LENGTH = 4;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    //线程执行的操作，相应客户端的请求
    public void run(){
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        OutputStream os=null;
        PrintWriter pw=null;
        try{
            //获取输入流，并读取客户端信息
            is = socket.getInputStream();
            isr =new InputStreamReader(is);
            br =new BufferedReader(isr);

            int data;
            String received = "";
            int count = 0;

            DataInputStream in = new DataInputStream(socket.getInputStream());
            while(socket.isConnected() && (data = in.read()) !=0){
                count++;
                received += formatData(data);
                if (count ==2){
                    count = 0;
                    System.out.println("接收到的卡号为：" + received);
                    received ="";
                }

            }
            if (!socket.isConnected()) {
                System.out.println("连接成功");
            }
            //System.out.println(received);
            BigInteger srch = new BigInteger(received, 16);
            System.out.println("十六进制字符串10000转为10进制后为:"+srch.toString());//转换为10进制并输出结果
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();

        } finally{
            //关闭资源
            try{
                if(pw!=null)
                    pw.close();
                if(os!=null)
                    os.close();
                if(br!=null)
                    br.close();
                if(isr!=null)
                    isr.close();
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String formatData(int data) {

        String hexData = Integer.toHexString(data);
        int length = hexData.length();
        if (length == 1) {
            return "0" + hexData;
        }
        return hexData;
    }


    public static void main(String[] args) {
        String h = "0d0a";
        BigInteger srch = new BigInteger(h, 16);
        System.out.println("转化后的结果为:"+srch.toString());//转换为10进制并输出结果

    }

}
