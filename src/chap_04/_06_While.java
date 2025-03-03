package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // while
        // 수영 예제
        int distance = 25; // 수영레일 길이
        float move = 0.0f; // 현재 이동 거리
        while (move< distance){

            System.out.println(move+"(m)를 발차기로 이동했습니다.");
            move += 0.323425;
        }
        System.out.println("도착했습니다.");

    }
}
