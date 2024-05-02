package Package1.Ex.poly.ex10;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일을 발송합니다: " + message);
    }
}
