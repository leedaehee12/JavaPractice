
class TvS{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

public class TvTest3 {
    public static void main(String[] args) {
        TvS t1 = new TvS();
        TvS t2 = new TvS();

        System.out.println("t1의 값은 : " + t1.channel + "입니다" );
        System.out.println("t2의 값은 : " + t2.channel + "입니다" );

        t2 = t1;

        t1.channel = 7;
        System.out.println("t1의 값은 : " + t1.channel + "입니다");
        System.out.println("t2의 값은 : " + t2.channel + "입니다");

    }

}

