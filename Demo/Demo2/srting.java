package Demo.Demo2;

public class srting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java牛逼");
        sb.append("真香");

        sb.insert(0, "傻逼");
        sb.replace(0, 5, "hello");
        System.out.println(sb);
    }
}