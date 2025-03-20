package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // 중간처리, 최종처리
        // Member => 남자 멤버의 나이 평균
        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("김정환", Member.MALE, 45),
                new Member("성춘향", Member.FEMALE, 27));

        // 남자 나이 평균
        // int manAvg = 0;
        // int manAgeSum = 0;
        // int count = 0;
        // for (Member member : members) {
        // if (member.getGender() == Member.MALE) {
        // manAgeSum += member.getAge();
        // count++;
        // manAvg = manAgeSum / count;
        // }
        // }
        // System.out.println("남자들의 나이 평균은 : " + manAvg);

        // 위 내용을 스트림으로 처리하기
        // filter(Predicate<? super Member> predicate)
        double ageAvg = members.stream()
                .filter((member) -> member.getGender() == Member.MALE)
                .mapToInt(Member::getAge) // Member::getAge = Member.getAge() 와같음
                .average()
                .getAsDouble();
        System.out.println("남자들의 나이 평균은 : " + ageAvg);
    }
}
