package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {
    public static void main(String[] args) {
        // FileInputStream fis = null;
        // FileOutputStream fos = null;

        int data = 0;
        byte b[] = new byte[1024];
        // try-with-resource : finally 에서 자원해제 하는 부분 자동화시키기
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos);) {

            while ((data = fis.read(b)) != -1) { // 바이트만큼 읽어오기
                // char ch = (char) data;
                // System.out.print(ch);
                fos.write(b); // 바이트만큼 쓰기
            }
            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
