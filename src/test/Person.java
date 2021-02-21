package src.test;

public class Person {// 公有的可继承,在java中所有的类都默认继承object类
    public void say() {
        System.out.println("说了一句话");
    }

    public int money = 10000000;// 如果是private就无法访问了
    // 或者还可以使用封装get,set,如下

    public void setmoney(int money) {
        this.money = money;// 子类不能对钱进行直接操作，但是可以按照规定使用
    }

    protected String name = "kuangshen";
}