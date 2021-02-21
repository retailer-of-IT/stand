package Demo.Demo2;

public class time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // String string = "";
        // for (int i = 0; i < 99999; i++) {
        // string += i;
        // }
        // System.out.println(string);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 99999; i++) {
            sb.append(i);
        }
        // System.out.println(sb.toString());
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));
    }
}