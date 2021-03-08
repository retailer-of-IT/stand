package Demo.kuang;

public class TestPriovity {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
        MyPriority myPpMyPriority = new MyPriority();
        Thread t1 = new Thread(myPpMyPriority);
        Thread t2 = new Thread(myPpMyPriority);
        Thread t3 = new Thread(myPpMyPriority);
        Thread t4 = new Thread(myPpMyPriority);
        Thread t5 = new Thread(myPpMyPriority);
        Thread t6 = new Thread(myPpMyPriority);
        // 先设置优先级，再启动
        t1.start();
        t2.setPriority(1);
        t2.start();
        t3.setPriority(4);
        t3.start();
        t4.setPriority(Thread.MAX_PRIORITY);// 最高优先级
        t4.start();
        t5.setPriority(7);
        t5.start();
        t6.setPriority(3);
        t6.start();
    }

}

class MyPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    }
}