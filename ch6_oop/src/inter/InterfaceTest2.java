package inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(I i) {
        i.methodB();
    }
}

class BB implements I {

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }

}

class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB()); // 인터페이스는 new 불가하므로 implements하는 BB를 생성
    }
}
