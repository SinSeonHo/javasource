package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력받아 그 내용을 파일에 작성하기
        // 사용자가 q 입력하면 입력 중지

        System.out.print("저장할 내용을 입력하세요 : \n");
        System.out.println("중지하려면 q를 입력해 주세요");

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {

            String data = "";

            do {
                System.out.print(">>");
                data = sc.nextLine();

                if (!data.equals("q")) {
                    br.write(data);
                    br.newLine();
                }

            } while (!data.equals("q"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
