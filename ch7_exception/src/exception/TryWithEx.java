package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { // finally의 주된 목적 열어놓은 자원을 닫는용도로 많이사용됨
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // try-with-resources : 자동 리소스 닫기
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
