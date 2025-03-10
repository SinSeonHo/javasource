package poly;

public class Animal { // public 클래스는 1개만 사용가능
    Animal() {
        System.out.println("Animal 생성자");
    }
}

class Canine extends Animal {
    Canine() {
        // super();
        System.out.println("Canine 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("Dog 생성자");
    }
}

class Cat extends Feline {
    Cat() {
        System.out.println("Cat 생성자");
    }
}