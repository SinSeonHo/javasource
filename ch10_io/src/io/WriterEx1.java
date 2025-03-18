package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받아 그 내용을 파일에 작성하기
        // 사용자가 q 입력하면 입력 중지
        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 내용을 입력하세요 : \n");
        System.out.println("중지하려면 q를 입력해 주세요");

        String data = "";
        String result = "";

        do {
            System.out.print(">>");
            data = sc.nextLine();
            result += data;

        } while (!data.equals("q"));

        try (FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            br.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }

}
