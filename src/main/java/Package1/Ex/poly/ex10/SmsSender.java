package Package1.Ex.poly.ex10;

public class SmsSender implements Sender {


    @Override
    public void sendMessage(String message) {
        System.out.println("sms메세지 발송합니다: " + message);
    }
}
