import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        System.out.println("현재월을 입력하세요");

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재계절은 봄이에요");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재계절은 여름이어요");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재계절은 가을이어요");
                break;
            default:
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울이어요");
        } 
    }
}
