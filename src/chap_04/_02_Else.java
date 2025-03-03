package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        int hour = 10;
        if(hour<14){
            System.out.println("Ice Americano +1 ");

        }else{
            System.out.println("Decafein Americano +1");
        }
        System.out.println("Complete order! #1");

        // 오후 2시 이후거나 모닝커피를 마신 경우
        hour = 15;
        boolean morningCoffee = true;
        if(hour>14 || morningCoffee ==true){
            System.out.println("Decafein Americano +1");
        }else{
            System.out.println("Ice Americano +1");
        }
        System.out.println("Complete order! #2");
    }
}
