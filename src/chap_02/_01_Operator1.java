package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 일반 연산
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3/2);
        // 정수 가능 연산일 때는 정수만 나옴(몫만 나옴)
        System.out.println(3%2); /// 나머지

        // 우선순위 연산
        System.out.println("\n우선 순위 연산");
        System.out.println(2+2*2);
        System.out.println((2+2) * 2); //괄호로 우선순위 정하는건 같음

        // 변수를 이용한 연산
        System.out.println("\n변수를 이용한 연산");
        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c);

        c = a-b;
        System.out.println(c);

        c = a*b;
        System.out.println(c);

        c = b/a; // 0.5 인데 나머지를 버림
        System.out.println(c);

        c = a%b;
        System.out.println(c);
    }
}
