package extend;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        Tv tv = new Tv();

        // 자식 인스턴스 생성
        CaptionTv captionTv = new CaptionTv();

        captionTv.channel = 10; // 부모로부터 상속받은 channel 멤버변수 사용
        captionTv.channelUp(); // 부모로부터 상속받은 channelUp 클래스 사용
        System.out.println("현재 채널 : " + captionTv.channel);
        captionTv.displayCaption("Hello Java");
        captionTv.caption = true;
        captionTv.displayCaption("Hello java");
    }
}
