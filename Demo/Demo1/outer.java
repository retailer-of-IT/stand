package Demo.Demo1;

public class outer {
    private int id = 10;

    public void out() {
        System.out.println("这是外部类的方法");
    }

    public class Inner {
        public void in() {
            System.out.println("这是内部类的方法");
        }

        public void getID() {
            System.out.println(id);
        }

    }
}