package chap_01;

import java.sql.SQLOutput;

public class _04_Comment {
    public static void main(String[] args) {
//        System.out.println("주석 다는 것!");
        System.out.println("(10분전) 잠시 후 결혼식이 시작 예정이오니 착성 부탁드립니다.");
//        System.out.println("(5분전) 잠시 후 결혼식이 시작 예정이오니 착성 부탁드립니다."); 자바에서는 // 가 주석 처리
        System.out.println("지금부터 결혼식을 시작하겠습니다!");

//      다른 예시
        int size = 120;
        size += 10; // 발이 빨리 자라는 것을 고려했다는 것을 주석으로 남김.
        // +=, -=, *= 등과 같은 연산은 C 나 python 과 같음.
        System.out.println("신발 사이즈는 "+size+"으로 보여주세요.");

        /*
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        */

        // 한 줄 주석 단축키: command + /
        // 여러 줄 주석 단축키: command + shift + /
    }

}
