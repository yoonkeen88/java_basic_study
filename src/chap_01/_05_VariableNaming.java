package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. under bar, 문자, 숫자 사용 가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 두 개 이상의 단어는 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        // 6. 예약어는 사용 불가 ( public, static, void, int, double, float,...)

        // 입국 신고서(여행)
        String nationality="대한민국"; // nation
        String firstName="광윤";
        String lastName="안";
        String dateOfBirth="2001-08-08";
        String residentialAdress="blarHodel";
        String purposOfVisit="Trip";
        // 여기서부터 언더바?
        String _flightNo = "KE657";
        String flight_no_2 = "KE658";
//        String -flight 하이픈으로는 사용할 수 없음
        int accompany = 2;
        String item1 = "시계";
        String item2 = "팔찌";
//        String 23df 는 안됨
        System.out.println(nationality);
        System.out.println(firstName);
//        System.out.println();
        // 임시 변수 if 문이나 for 무에서 사용하는건 변수에 큰 힘을 안써도 됨

        int i = 0;

        // 상수는 대문자
        final String CODE = "abcd";

    }
}
