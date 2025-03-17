package api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {
        // 한 어린이의 키를 2015 ~ 2024년 사이에 1년 단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 125 130 139 160 169 173 175

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>(); // 키 저장 리스트 생성

        // 키 입력받기

        System.out.println("10년 동안의 키를 입력해 주세요");
        System.out.print(">> ");
        String input = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input, " "); // 토크나이저 delim 인자안주면 자동으로 공백기준으로 자름
        while (tokenizer.hasMoreTokens()) {
            arrayList.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // for (int i = 2015; i < 2025; i++) {
        // System.out.printf("%d년도 키 입력 : ", i);
        // arrayList.add(Integer.parseInt(sc.nextLine()));
        // }

        // 가장 키가 큰 년도와 cm 출력
        int diff = 0; // 자란 키 수치 저장
        int pos = 0; // 해당 년도 저장

        for (int i = 0; i < arrayList.size() - 1; i++) {
            int sub = arrayList.get(i + 1) - arrayList.get(i); // 해당년도 - 직전년도 = 해당년도 키 큰수치
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }

        System.out.println("가장 키가 많이 자란 년도는 " + (pos + 2015) + "년, 자란 키는 " + diff + " cm입니다.");

        sc.close();
    }

    // public static int maxYear(ArrayList arrayList) {
    // int maxYear = 0;
    // for (int i = 0; i < arrayList.size(); i++) {

    // }
    // return maxYear;
    // }
}
