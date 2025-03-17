package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // 고객 5명 저장가능한 배열선언
    // private User[] users = new User[5];

    // 고객 5명 저장가능한 리스트선언
    private List<User> users = new ArrayList<>(5);

    // 제품 10개 저장가능한 배열 생성
    // private Product[] products = new Product[10];

    // 제품 저장가능한 리스트선언
    private List<Product> products = new ArrayList<>();

    // cart (제품 저장 가능한 장바구니 배열)
    // private Product[] cart = new Product[10];

    // 장바구니 리스트선언
    private List<Product> cart = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // start() 에서 선택된 user를 보관하기 위한 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명의 User생성 후 배열객체에 저장

        // users[0] = new User("홍길동", PayType.CARD);
        // users[1] = new User("성춘향", PayType.CASH);

        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // 5개의 제품 생성 후 배열객체에 저장 (tv2개, cellphone3개)

        // products[0] = new Tv("삼성 QLED", 5000000, "QLED");
        // products[1] = new Tv("LG 울트라 HD", 4500000, "4K");
        // products[2] = new CellPhone("갤럭시 S25", 1500000, "SKT");
        // products[3] = new CellPhone("아이폰", 2000000, "LGU+");
        // products[4] = new CellPhone("갤럭시 A3", 1000000, "KT");

        products.add(new Tv("삼성 QLED", 5000000, "QLED"));
        products.add(new Tv("LG 울트라 HD", 4500000, "4K"));
        products.add(new CellPhone("갤럭시 S25", 1500000, "SKT"));
        products.add(new CellPhone("아이폰", 2000000, "LGU+"));
        products.add(new CellPhone("갤럭시 A3", 1000000, "KT"));
    }

    @Override
    public void start() {

        System.out.println(title + " 메인화면 - 계정선택");
        System.out.println("=================================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                // System.out.println("[" + i + "]" + users[i].getName() +
                // users[i].getPayType());
                System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }

        System.out.println("[x] 종료");
        System.out.println("=================================");
        System.out.print("선택 : "); // 0 or 1 or x

        String input = sc.nextLine();

        switch (input) {
            case "x":
            case "X":
                System.out.println("종료합니다");
                System.exit(0); // 프로그램 종료
                break;
            case "0":
            case "1":
                // 사용자가 선택한 user 정보를 담기 (checkout() 메소드에서 필요)
                selUser = input;
                productList();
            default:
                System.out.println("입력을 확인해주세요.");
                break;
        }

    }

    public void productList() {

        System.out.println(title + " 상품목록 - 상품선택");
        System.out.println("=================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                // products[i].printDetail();
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }

        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("=================================");
        System.out.print("선택 : ");

        // 0 ~ 4 or h or c 입력받기
        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // cart 배열에 선택한 제품 담기
                cart.add(products.get(Integer.parseInt(input)));
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkout();
                break;
            default:
                break;
        }
    }

    public void checkout() {

        System.out.println(title + " : " + users.get(Integer.parseInt(selUser)).getName() + "  체크아웃");
        System.out.println("=================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (cart != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : " + users.get(Integer.parseInt(selUser)).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("=================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");

        String input = sc.nextLine();

        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.out.println("감사합니다.");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
