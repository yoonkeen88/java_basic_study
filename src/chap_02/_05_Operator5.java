package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참인_경우_결과값) : (거짓인_경우_결과값)

        int x = 3;
        int y = 5;

        int max,min;
        max = (x > y) ? x:y;
        System.out.println(max);
        System.out.println();

        min = (x > y) ? y:x;
        System.out.println(min);
        System.out.println();

        x=3;
        y=3;

        boolean b = (x==y) ? true:false;
        System.out.println(b);
        System.out.println();


        String s = (x!=y) ? "달라요!":"같아요";
        System.out.println(s);
    }
}
