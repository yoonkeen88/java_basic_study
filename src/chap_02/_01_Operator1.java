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


        // 증감 연산 ++, --
//        ++val; // 증감 뒤 문장 수행
//        val++ 문장 수행 뒤 증감

        int val;
        val = 10;
        System.out.println(val);
        System.out.println(val++); // 위와 똑같이 10이 출력됨
        System.out.println(val); // 위 문장이 실행 되고 올라갔기에 11이됨.

        val = 10;
        System.out.println(val); // 10으로 초기화 했으니 10
        System.out.println(++val); // 증감이 앞에 있으니 증감을 우선하고 출력
        System.out.println(val); // 증감된 값이 그대로 출력

        val = 10;
        System.out.println(val);
        System.out.println(val--); // 문장 수행이 먼저 되기에 -> 10
        System.out.println(val); // 위 문장이 실행 되고 올라갔기에 -> 9

        val = 10;
        System.out.println(val); // 10으로 초기화 했으니 10
        System.out.println(--val); // 증감이 앞에 있으니 증감을 우선하고 출력 -> 9
        System.out.println(val); // 증감된 값이 그대로 출력 -> 9

        int waiting = 0;
        System.out.println("\n대기 인원 : " + waiting++ ); // 대기인원: 0
        System.out.println("대기 인원 : " + waiting++ ); // 대기인원: 1
        System.out.println("대기 인원 : " + waiting++ ); // 대기인원: 2
        System.out.println("대기 인원 : " + waiting++ ); // 대기인원: 3
        System.out.println("총 대기 인원 : " + waiting);

        waiting = 0;
        System.out.println("\n대기 인원 : " + ++waiting ); // 대기인원: 1
        System.out.println("대기 인원 : " + ++waiting ); // 대기인원: 2
        System.out.println("대기 인원 : " + ++waiting ); // 대기인원: 3
        System.out.println("대기 인원 : " + ++waiting ); // 대기인원: 4
        System.out.println("총 대기 인원 : " + waiting);

    }
}
