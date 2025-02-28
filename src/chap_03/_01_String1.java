package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like JAVA and Python and C.";
        System.out.println(s);
        // 문자열의 길이 확인
        System.out.println(s.length());
        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함관계
        System.out.println(s.contains("Python")); // boolean 으로 반환
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("JAVA")); // 포함되는 단어위 시작 위치를 반환 | 첫 위치를 반환
        System.out.println(s.indexOf("C#")); // 없으면 -1 을 반환

        System.out.println(s.indexOf("and")); // 이러면 중복 된 경우 맨 앞에 있는 것만 반환
        System.out.println(s.lastIndexOf("and"));

        // 시작 끝 여부
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));


    }
}
