package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨증가
        volumeup(data);
        volumeup(data);

        //볼륨 감소
        volumedown(data);


        //음악 플레이어 상태
        state(data);

        //음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeup(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 증가");
    }

    static void volumedown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 감소");
    }

    static void state(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:");
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }


}
