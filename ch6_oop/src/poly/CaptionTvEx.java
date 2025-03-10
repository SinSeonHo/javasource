package poly;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 조상 타입의 참조변수로 자식 인스턴스 참조
        Tv2 tv = new CaptionTv();

        tv.channel = 10; // 부모로부터 상속받은 channel 멤버변수 사용
        tv.channelUp(); // 부모로부터 상속받은 channelUp 클래스 사용
        System.out.println("현재 채널 : " + tv.channel);

        // 캐스팅을 통해 자손의 멤버에 접근한다.
        CaptionTv ctv = (CaptionTv) tv;
        ctv.displayCaption("Hello Java");
        ctv.caption = true;
        ctv.displayCaption("Hello java");
    }
}
