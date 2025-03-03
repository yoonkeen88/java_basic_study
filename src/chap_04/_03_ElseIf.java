package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // Else If
        // 다른 조건들의 나열
        // 1. 한라봉 에이드가 있다면
        // 2. 또는 망고가 있다면
        // 3. 다른 경우 아이스 아메리카노

        boolean hallabongAde = false;
        boolean mangoJucie = true;
        if(hallabongAde){
            System.out.println("HanlabongAde +1 ");
        }else if(mangoJucie){
            System.out.println("MangoJucie +1 ");
        }
        else{
            System.out.println("IceAmericano +1 ");
        }
        System.out.println("Complete Order! #1");

        // else if 여러번 사용 가능

        hallabongAde = false;
        mangoJucie = false;
        boolean orangeJucie = true;
        if(hallabongAde){
            System.out.println("HanlabongAde +1 ");
        }else if(mangoJucie){
            System.out.println("MangoJucie +1 ");
        }else if(orangeJucie){
        System.out.println("orangeJucie +1 ");
        }else{
            System.out.println("IceAmericano +1 ");
        }
        System.out.println("Complete Order! #2");

        // else 도 없어도 됨

        hallabongAde = false;
        mangoJucie = false;
        orangeJucie = false;
        if(hallabongAde){
            System.out.println("HanlabongAde +1 ");
        }else if(mangoJucie){
            System.out.println("MangoJucie +1 ");
        }else if(orangeJucie){
            System.out.println("orangeJucie +1 ");
        }else{
            System.out.println("IceAmericano +1 ");
        }
        System.out.println("Complete Order! #3");
    }
}
