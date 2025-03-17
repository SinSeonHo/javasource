package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}

public class FruitBoxEx1 {

    // Comparator<String> c;

    public static void main(String[] args) {
        Box3<Fruit> frutiBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        // 상속관계 시 부모타입으로 제네릭 선언시 모든 자식 담을 수 있음
        frutiBox.add(new Fruit());
        frutiBox.add(new Apple());

        appleBox.add(new Apple());
        // appleBox.add(new Fruit()); 부모못담음
        // appleBox.add(new Grape()); 형제관계같은건없음

        grapeBox.add(new Grape());
        // grapeBox.add(new Apple());
        // grapeBox.add(new Fruit());

        toyBox.add(new Toy());
        // toyBox.add(new Fruit()); 상속관계없으므로 자기자신만 담을수있음

        // sort(대상리스트, Comparator<? super Apple> c)
        // <? super Apple> : Apple 클래스 + 부모(Fruit, Object) 까지만 허용
        List<Apple> list = new ArrayList<>();
        Collections.sort(list, null);

    }
}
