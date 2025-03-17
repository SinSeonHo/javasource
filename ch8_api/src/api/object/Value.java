package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;

        return this.value == v.value;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // toString() : 멤버 변수의 값을 출력하는 용도로 주로 재정의하여 사용
    // @Override
    // public String toString() {

    // return value + ""; // + 문자열을통해 숫자를 문자열로 변환가능
    // }

}
