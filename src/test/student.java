package src.test;

public class student extends Person {// 继承关系extends
    private String name = "qinjiang";

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}