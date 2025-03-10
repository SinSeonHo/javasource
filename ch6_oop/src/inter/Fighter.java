package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable { // 클래스를 이런식으로 많이 구성함

    String msg;
    Scanner sc;

    @Override
    public void move(int x, int y) {
        Math.random();
    }

    @Override
    public void attack(Unit unit) {

    }

}
