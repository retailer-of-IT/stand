package Demo.Demo3;

public class talkStudent {
    public static void main(String[] args) {
        new Thread(new talksender(7777, "localhost", 9909)).start();
        new Thread(new talkreceiver(8808, "老师")).start();
    }
}