package Demo.Demo3;

public class talkTeacher {
    public static void main(String[] args) {
        new Thread(new talksender(5555, "localhost", 8808)).start();
        new Thread(new talkreceiver(9909, "学生")).start();
    }
}