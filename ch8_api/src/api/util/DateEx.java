package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:02:54 KST 2025

        // Date와 짝꿍
        // yyyy : 년도 4자리, yy : 년도 2자리
        // MM : 월 2자리 1 ~ 9 월표현 01 ~ 09
        // dd : 일 2자리
        // hh : 시
        // mm : 분
        // ss : 초
        // a : AM, PM

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d)); // 2025-03-13

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d)); // 2025-03-13 01:09:58

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d)); // 2025-03-13 오후 01:11:17

        sdf = new SimpleDateFormat("오늘은 E 요일");
        System.out.println(sdf.format(d)); // 오늘은 목 요일
    }
}
