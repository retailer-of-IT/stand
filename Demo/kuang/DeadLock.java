package Demo.kuang;
//死锁，多线程同时抱住对方需要的资源，形成僵持

//import javax.security.auth.callback.ChoiceCallback;

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");
        g1.start();
        g2.start();
    }
}

class Lipstick {

}

class Mirror {

}

class Makeup extends Thread {
    static Lipstick Lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;// 选择
    String girlname;// 使用化妆品的人

    Makeup(int choice, String girlname) {
        this.choice = choice;
        this.girlname = girlname;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 化妆，护持对方锁
    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (Lipstick) {
                System.out.println(this.girlname + "获得口红的锁");
                Thread.sleep(1000);
                // 当下面的sync...在这里时会发生死锁
            }
            synchronized (mirror) {// 1秒后获得镜子
                System.out.println(this.girlname + "获得镜子的锁");
            }
        } else {
            synchronized (mirror) {
                System.out.println(this.girlname + "获得镜子的锁");
                Thread.sleep(2000);
                // sync...在这里时发生死锁
            }
            synchronized (Lipstick) {// 2秒后获得口红
                System.out.println(this.girlname + "获得口红的锁");
            }
        }
    }
}