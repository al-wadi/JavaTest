package arrayList.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<String> slist = new ArrayList<String>();

        //ArrayList<String> s2list = slist;

        slist.add("1");
        slist.add("7");
        slist.add("4");
        slist.add("3");
        slist.add("5");


        slist.add(0,"6");

        slist.remove(0);

        for (String s : slist) System.out.println(s);

        String element = slist.get(3);
        System.out.println(element);

        //replace
        slist.set(1,"9");
        System.out.println("update = "+slist.get(1));

        if (slist.contains("5")) System.out.println("The element exists.");
        else System.out.println("The element doesn't exist.");

        Collections.sort(slist);
        System.out.println("The List after sort :- "+ slist);

        slist.reversed();
        System.out.println("The reversed list :- "+slist);

        List<String> sub_list = slist.subList(0,2);
        System.out.println("The Sub List :- "+sub_list);

        slist.ensureCapacity(9);
        System.out.println("The List size :- "+slist.size());

    }
}

