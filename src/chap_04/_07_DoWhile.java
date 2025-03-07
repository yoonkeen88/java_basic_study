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

        move =0f;
        height = 1.8f;
        do {
            System.out.println("광윤이가 발차기를 합니다.\n"+move+"m를 이동했습니다.");
            move +=0.1234522;
        } while(move+height < distance);
    }
}
