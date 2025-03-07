
package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 부모인스턴스생성 후 자식인스턴스생성
        System.out.println("이름 : " + obj.name); // 부모와 자식클래스에서 동일한이름의 변수를 선언하면 본인것이 우선됨
        obj.list(); // 성춘향 하위 클래스 이름 출력을 원한다면??
    }
}
