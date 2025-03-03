package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님
        int ranking = 6;
        if(ranking==1){
            System.out.println("전액장학금");
        }else if(ranking==2 || ranking==3){
            System.out.println("반액장학금");
        }else{
            System.out.println("아무것도 아님");
        }
        System.out.println("조회 완료 #1");

        System.out.println("\nSwitch");
        ranking =1;
        // Switch Case 문 이용
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("전액 장학금");
                break;
            case 3:
                System.out.println("전액 장학금");
                break;
            default:
                System.out.println("대상이 아님");
                break; //여기는 안적어줘도 되노
        }
        System.out.println("Switch 로 조회 완료 #2");


        // 중복제거
        System.out.println("\nSwitch");
        ranking =2;
        // Switch Case 문 이용
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상이 아님");
                break; //여기는 안적어줘도 되노
        }
        System.out.println("Switch 로 조회 완료 #3");

        // 중고 상품의 등급에 따른 가격을 책정( 1금 : 최상, 4급 : 최하)
        int grade = 2;
        int price = 5000;
        switch (grade){
            case 1:
                price +=1000;
            case 2:
                price +=1000;
            case 3:
                price +=200;
            default:
                price +=3000;
                break;
        }// break 가 없으면 조건에 맞는 순간부터 다 실행하게 됨(조건이 다른 부분도 실행이 됨.)
        System.out.println(grade+"등급의 가격 : " + price+"원");

    }
}
