package member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class MemberDTO {
    private int no;
    private String id;
    private String name;
    private String addr;
    private String email;
    private int age;
    private String remark;
}
