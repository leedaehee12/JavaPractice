import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월수를 입력하는거에요");
        int month = sc.nextInt();

        if(month == 1 || month ==2 || month == 12){
            System.out.println("겨울이어요");
        } else if (month == 3 || month == 4 || month == 5){
            System.out.println("봄이어요");
        }else if (month == 6 || month == 7 || month == 8){
            System.out.println("여름이어요");
        } else {
            System.out.println("가을이어요");
        }
            sc.close();

    }
}
