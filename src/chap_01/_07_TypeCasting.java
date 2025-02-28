package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 type casting
        // 정수 -> 실수
        // 실수 -> 정수

//        int score = 93+89.0; // 이경우는 에러가 발생함 결과가 정수가 아님
        int score = 933;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((float) score);

//      float, double to integer

        float score_f = 93.3F;
        double score_d = 930.4;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //
        score = score+(int)score_d+ (int)score_f;
        System.out.println(score);

//        다른 방식으로 형 변환
        double changeByDefineDou = score;
        System.out.println(changeByDefineDou);
        // int -> long -> float -> double 순은 자동으로 형 변환 가능

//        int changeByDefineInt = changeByDefineDou;  실수에서 정수는 안됨 괄호 형 변환 해야됨
//        System.out.println(changeByDefineInt);

        // double -> float -> long -> int 순은 수동으로 형 변환 해야됨.

        // Number to string
        // there is two method string class and integer class
        String s1 = String.valueOf(score);
        s1 = Integer.toString(score);
        System.out.println(s1+" "+(score+1));


        String s2 = String.valueOf(90.22/3);
        System.out.println(s2);
        s2 = Double.toString(90.22/3);
        System.out.println(s2);

        // String to number
        int i = Integer.parseInt("93"); //파싱한다?

        System.out.println(i);

        double d = Double.parseDouble("89.832");
        System.out.println(d);

//        int error = Integer.parseInt("자바"); ->>>>>> 에러가남~
    }
}
