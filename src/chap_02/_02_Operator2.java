package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num +2;
        num += 2; // 복합 대입 연산자
        System.out.println(num);

        num -=2;
        System.out.println(num);
        num = num -2 ;
        System.out.println(num);

        num = num * 2;
        System.out.println(num);
        num/=2;
        System.out.println(num);


        num%=3;
        System.out.println(num);

    }
}
