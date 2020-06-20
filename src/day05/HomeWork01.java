package day05;

import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d = 0;
        byte [] b = new byte[1024];
        while ((d = bis.read(b)) != -1){
            bos.write(b,0,d);
        }
        bos.flush();
        bos.close();
        System.out.println("复制成功");



    }
}
