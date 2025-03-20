package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString

// @Getter
// @AllArgsConstructor

public class Student {
    private String name;
    private int math;

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public Student(String name, int math) {
        this.name = name;
        this.math = math;
    }

}
