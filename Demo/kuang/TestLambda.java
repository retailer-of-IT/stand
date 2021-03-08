package Demo.kuang;

public class TestLambda {// lambda表达式的用法
    public static void main(String[] args) {
        ILove love = a -> {
            System.out.println("I love you " + a);
        };
        love.love(520);
    }

}

interface ILove {
    void love(int a);
}
