package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // String compare
        String s1 = "JAVA";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // 같으면 true 다르면 false
        System.out.println(s1.equals("JAVA"));
        System.out.println(s2.equals("python")); // equals 는 대소문자 구분함
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용이 같은지
        // 여부를 확인함

        // 문자열 비교 심화
        s1 = "1234"; // 화장실 비밀번호 예시
        s2 = "1234";
        //s1, s2 는 같은 곳을 참조
        System.out.println(s1.equals(s2)); // 내용비교
        System.out.println(s1 ==s2); // 참조 값 비교


        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // 내용을 비교하기에 여전히 true
        System.out.println(s1==s2); //new String 의 경우 등호로 하지 못함

//        new String 의 경우 등호 비교가 불가능한 상황인 이유는 위에서는 얕은 복사 즉 같은 메모리의 값을 참조 하고 있지만
//        new String 은 각 다른 값을 가지고 있기 대문 equals 는 내용이 같은지 보는거고 등호는
    }
}
