package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // For -> repeat
        System.out.println("안녕하세요 나코입니다.");
        // costomer again
        for(int i = 0; i <100; i++){
            System.out.println("For : "+i+"\n안녕하세요 나코입니다!");
        }

        // Except odd print
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " "); // print 로 하면 줄 안바꿈

        }
        System.out.println("");
        for (int i = 1; i < 11; i+=2) {
            System.out.print(i+" "); // print 로 하면 줄 안바꿈

        }
        System.out.println("");
        for (int i = 10; i > 0; i-=2) {
            System.out.print(i+" "); // print 로 하면 줄 안바꿈

        }
    }
}
