package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 추상클래스 : 클래스 + 추상메소드, 직접 객체생성 불가, 부모역할
// InputStream 추상 메소드 - int read(), int read(byte[] b, int off, int len), int read(byte b[])
// OutputStream 추상 메소드 - write(int b), write(byte b[], int off, int len), write(byte b[])
public class InputStreamEx1 {
    public static void main(String[] args) {
        // ~ Stream : 입력값을 byte 형태로 처리(문자, 이미지, 동영상 처리가능)
        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // read()는 byte 하나만 읽어서 int형태로 반환해줌 (영어, 숫자만 가능 / 한글불가)
            // int input = in.read(); // abc 입력
            // out.write(input); // a 출력

            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }

            byte[] b = new byte[1024];
            while ((in.read(b)) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
