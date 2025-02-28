package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        /*
        주민등록번호를 출력하는 것.
        주민등록번호는 생년월일(6자리) - 7자리
        생년월일과 성별까지 출력하는 프로그램 작성
         */
        String identity = "010808-3892126";
        System.out.println(identity.substring(0,8));
        System.out.println(identity.substring(0,identity.indexOf("-")+2)); // 마지막 인덱스는 포함 하지 않음으로 +2 해줌
    }
}
