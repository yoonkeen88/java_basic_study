package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like JAVA and Python and C and C++ and You.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7).replace(" and",","));
        System.out.println(s.substring(s.indexOf("JAVA")).replace(" and", ","));


        // substring
        // lenght 도 한번 써보자
        System.out.println(s.substring(s.indexOf("JAVA"),s.length()-1));
        // 파이썬이랑 마찬가지로 시작은 포함하지만 끝나는 곳은 포함하지 않음
        System.out.println(s.substring(s.indexOf("JAVA"), s.indexOf(".")).replace(" and","|"));
        System.out.println();
        // 공백제거
        String s2 = "              I love you          ";
        System.out.println(s2);
        System.out.println(s2.trim());

        // 문자열 결합
        String s_1 = "JAVA";
        String s_2 = "Python";
        System.out.println(s_1+s_2);
        System.out.println("더하기 사용 : "+s_1 + ", "+s_2); // + 연산자로도 문자열 붙여쓰기가 가능하지만
        // concat

        System.out.println("concat 함수 사용 : "+s_1.concat(", ").concat(s_2));
    }
}
