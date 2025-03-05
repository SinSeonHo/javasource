package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new GoodsStock() => default 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();

        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;

        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        System.out.println(goodsStock);

        // 5개 판매
        goodsStock.subStock(5);
        // 현재 재고수량 확인
        System.out.println(goodsStock);

        // 10개 입고
        goodsStock.addStock(10);
        // 현재 재고수량 확인
        System.out.println(goodsStock);
    }
}
