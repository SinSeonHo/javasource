package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // 클래스 위에 Setter 위치시 모든 멤버변수의 setter 메소드 작성(getter도 동일)
@ToString

public class Person {
    private String pno;
    private String name;
    private String tel;

}
