package Package1.access;

public class Speaker {
    private int volume;
    //같은 클래스내에서는 접근할 수 있게 하는것이 private키워드

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 있다. 최대 음량입니다");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재음량: " + volume);
    }
}
