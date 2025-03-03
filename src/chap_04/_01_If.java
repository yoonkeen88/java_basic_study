package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 제어문에 대해서 학습
        // condition => If
        int hour = 10;
        boolean morning_coffee = true;

        for (int i =9 ; i <=24; i++){
            if(i<15){
                System.out.println("You can drink coffee");
            }
            else{
                System.out.println("Do not drink coffee!");
            }
        }
//        if 문 내에서 문장 실행이 1개라면 중괄호 생략 가능

        if (hour<20)
            System.out.println("붙여서 쓸 수 있음\n");
        if (hour<20) {
            System.out.println("붙여서 쓸 수 있음");
            System.out.println("2줄 부터는 중괄호 필요");
        }

        if (hour > 20 &&  !morning_coffee){
            System.out.println("Ice americano no");
        }

        hour = 14;
        morning_coffee = true;
        if (hour >=14 || morning_coffee){
            System.out.println("decafein");
        }

    }
}
