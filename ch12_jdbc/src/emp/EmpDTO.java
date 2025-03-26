package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~~DTO : Data Transfer Object - 메소드에서 데이터를 담아서 전달하는 객체

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class EmpDTO {
    // 테이블의 하나의 행과 같은 구조로 생성
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptNo;
}
