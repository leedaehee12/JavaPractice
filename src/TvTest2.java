class tv{
    String color;
    boolean power;
    int channel;
    void power(){
        power = !power;
    }
    void channelUp(){++channel;
    }
    void  channelDown() {
        --channel;
    }

}

public class TvTest2 {
    public static void main(String[] args) {
        tv t1 = new tv();
        tv t2 = new tv();
        System.out.println("t1의 채널은" + t1.channel + "입니다.");
        System.out.println("t2의 채널은" +t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 채널이" + t1.channel + "으로 변경되었습니다");

        System.out.println("t1 의 채널은" + t1.channel +"입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");


    }




}
