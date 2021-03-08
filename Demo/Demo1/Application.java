package Demo.Demo1;

//import Demo.Demo1.outer;
public class Application {
    // 静态方法和非静态的方法差别很大
    public static void main(String[] args) {
        /*
         * A a = new A(); a.test(); B b = new A();// 父类的引用指向了子类 b.test();
         */
        /*
         * outer out = new outer(); outer.Inner inner = out.new Inner(); inner.in();
         * inner.getID();
         */
        int a = 1;
        int b = 0;
        try {
            System.out.println(a / b);// 可能出现异常的代码
        } catch (Exception e) {// 异常类名 + e
            System.out.println("b不能为0");
        } catch (Throwable e) {
            System.out.println("b为0");
        } finally {
            System.out.println("finally");
        }

    }
}