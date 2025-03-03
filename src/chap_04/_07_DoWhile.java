package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Do while 반복문
        int distance = 25;
        float move = 0.0f;
        float height = 1.79f;
        while (move+height<distance){
            System.out.println(move+"(m)를 발차기로 이동했습니다.");
            move += 0.323425;
        }
        System.out.println("도착했습니다!");
    }
}
