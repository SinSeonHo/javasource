package inter;

class A {
    public void methodA(B b) { // B객체를 사용
        b.methodB();
    }
}

class B {
    public void methodB() { // B객체를 제공
        System.out.println("methodB()");
    }

}

class InterfaceTest1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B()); // new B()를 해주지않으면 nullPointerExeption발생
    }
}
