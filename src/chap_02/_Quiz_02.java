package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        long height = 323232323235l;
        int min = 120;
        String re = (height>=min) ? " 이므로 탑승이 가능합니다." : " 이므로 탑승이 불가능합니다.";
        System.out.println("키가 "+height +"cm" + re);

    }
}
