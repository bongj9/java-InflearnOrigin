package Package1.Ex.poly.ex10;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 메세지: "
                + message);
    }
}
