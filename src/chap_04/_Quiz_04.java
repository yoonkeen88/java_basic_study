package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean is_changelleger =true;
        boolean is_small = false;
        int during = 10;
        int pay = during * 4000;

        if(pay>30_000){
            pay = 30000;
        }

        if(is_changelleger||is_small){
            pay /=2;
        }
        System.out.println("최종 주차 요금 : " + pay + "원 입니다.");
    }
}
