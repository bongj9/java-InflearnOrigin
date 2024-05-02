package Package1.OOP1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData(); //생성자를 가져다쓰기
        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        //볼륨 업
        data.volume++;
        System.out.println("음악 플레이어 볼륨 :" +
                data.volume);
        //볼륨 다운
        data.volume--;
        System.out.println("음악 플레이어 : " + data.volume);
        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악플레이어가 꺼졌습니다");
        //음악플레이어 상태
        if (data.isOn) {
            System.out.println("음악플레이어 ON ,볼륨: " +
                    data.volume);}
            else{
                System.out.println("음악플레이어를 종료합니다");
            }
        }
    }

