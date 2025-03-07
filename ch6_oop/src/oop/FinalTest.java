package oop;

// public final class FinalTest {}
// 클래스 상속불가 class Test extends FinalTest{}

public class FinalTest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // 멤버변수 변경불가 MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // 지역변수 변경불가 LV = 20;
    }
}

class Test extends FinalTest {

}