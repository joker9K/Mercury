package main;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author supo
 * @Date 2017/3/30 16:55.
 * Copyright © mizhuanglicai
 */
public class 打卡 {

    public static void main(String[] args) throws IOException {
        java.time.LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String landing = localDateTime.format(format);
        String message = landing + "  打卡\n";
        String filePath = System.getProperty("user.dir")+"/README.md";
        RandomAccessFile raf=new RandomAccessFile(filePath,"rw");
        boolean flag = false;
        String s;
        while ((s =raf.readLine()) != null) {
            s = new String(s.getBytes("8859_1"), "UTF-8");
            if(s.contains(LocalDate.now().toString())){
                flag = true;
                break;
            }
        }
        if(flag){
            raf.seek(raf.getFilePointer()-28);
            raf.write(message.getBytes());
            System.out.print("更新成功！");
        }else {
            raf.write(message.getBytes());
            System.out.print("打卡成功！");
        }
        System.out.println(landing);
        raf.close();
    }
}
