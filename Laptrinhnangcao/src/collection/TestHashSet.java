package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ha Noi");
        set.add("Hue");
        set.add("Da Nang");
        set.add("Ho CHi Minh");

        System.out.println(set);

        for(String s : set) {
            System.out.println(s.toUpperCase() + " ");
        }



        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Ha Noi");
        set1.add("Hue");
        set1.add("Da Nang");
        set1.add("Ho Chi Minh");
        System.out.println(set1);

        for(String element : set1) {
            System.out.println(element.toUpperCase() + " ");
        }
    }

}
