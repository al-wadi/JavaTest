package arrayList.test1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> slist = new ArrayList<String>();

        slist.add("1");
        slist.add("2");
        slist.add("3");
        slist.add("4");

        for (String s:slist) System.out.println(s);
    }
}
