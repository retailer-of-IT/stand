package Demo;

public class testMain {
    public static void main(String[] args) {
        String str = "this is a text";
        String[] arr = str.split(" ");
        System.out.println("----将str中的单词提取-------");
        for (String string : arr) {
            System.out.println(string);
        }
        String str2 = str.replace("text", "easy text");
        System.out.println(str2);
        for (int i = 0; i < arr.length; i++) {
            char first = arr[i].charAt(0);
            char upperfirst = Character.toUpperCase(first);
            String newstr = upperfirst + arr[i].substring(1);
            System.out.println(newstr);
        }
    }

}
