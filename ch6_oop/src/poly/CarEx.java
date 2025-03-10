package poly;

public class CarEx {
    public static void main(String[] args) {

        Car car = new FireEngine();
        car.drive();
        car.stop();

        // car.water();

        FireEngine car1 = (FireEngine) car;
        car1.water();

        ((FireEngine) car).water(); // 1줄로 표현

        // instanceof : 참조변수가 참조하고있는 실제 인스턴스의 타입 알아보기

        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 임");
        }

        if (car instanceof Car) {
            System.out.println("Car의 instance 임");
        }

        Car car2 = new Car();

        if (car2 instanceof FireEngine) { // false (FireEngine)car2; 불가능
            System.out.println("car2 - FireEngine의 instance 임");
        }

        if (car2 instanceof Car) {
            System.out.println("car2- Car의 instance 임");
        }
    }
}
