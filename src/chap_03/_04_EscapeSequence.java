package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자, 스페셜 캐릭터
        // \n, \t, \\, \", \' 등이 있음
        // \n: 줄바꿈
        System.out.println("자바가\n너무\n재밌어요.\n");

        // \t 간격 조절
        System.out.println("해물파전\t9000원\n김치전\t7200원\n부추전\t7600원\n");

        // \\ : 역슬레시는 escape 문자이기에 두번쳐야됨 언제?: 윈도우
        System.out.println("C:\\Program Files\\JAVA\\NADOCODE");


        // \", \': 따옴표는 문자열 변수 선언시 사용 따라서 역슬레시 + 따옴표

        System.out.println("민지는 말했다. \n\"내가 무엇을 잘 못했다고?!\"\n\'네 걱정이나해\'");
        // 문자열 내에서 작은 따옴표는 escape 를 크게 쓸 일은 없음-char 형 변수에서 사용

        System.out.println('\'');


    }
}
