package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자 ||, &&

        boolean gim = true;
        boolean gea = true;
        boolean jae = false;

        System.out.println(gim || gea || jae);
        System.out.println(gim && jae && gea);
// and 조건
        System.out.println();
        System.out.println((5 > 3) && (3 > 1)); // 5가 3보다 크고 3도 1보다 작은 경우
        System.out.println((5>3)&&(3<1));
// or 조건
        System.out.println();
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));

// 논리 부정 연산자
        System.out.println();
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(5==3)); // 원래 false 인데 true 가 나옴
    }
}
