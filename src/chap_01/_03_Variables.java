package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // 문자열 변수 선언
        name = "안광윤"; // 초기화
        // 문자열 변수는 큰 따옴표를 사용 문자 변수는 작은 따옴표 사용
//        int age = 14;
        int hour =14;
        System.out.println(name + "님 배송이 곧 완료 됩니다." +hour+"시 완료 예정입니다");
        System.out.println(name + "님 배송이 "+hour+"시에 완료 되었습니다");
        double score = 90.5;
        char grage = 'A';// char 변수 이기에 작은 따옴표 사용한 것.
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " +score+ "점 입니다.");
        System.out.println("학점은 "+grage+" 입니다.");


        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?:" + pass);

        double d = 3.14123456789; // 정밀한 실수도 입력할 수 있음
        float f = 3.14123456789f; // 더블 보다 플롯이 더 작은 것. 플롯에 소숫점을 넣고 싶으면 숫자 뒤에 F,f 를 넣으면 됨.
        System.out.println(d);
        System.out.println(f); // 소숫점 8번째까지 밖에 못 함.


        long l = 1000_000_000_000l; // 큰 정수를 하기 위해 long 변수형으로 선언 해주고 숫자 뒤에 L,l 을 붙여줌.
        // 정수 값에 약 -21 억부터 21억까지 이상 초과하는 값은 못넣음
        System.out.println(l);

    }
}
