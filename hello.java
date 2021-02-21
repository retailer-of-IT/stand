import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class hello {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("b".equals(s)) {
                lit.add("java");
            }
            System.out.println(list);
        }
    }
}