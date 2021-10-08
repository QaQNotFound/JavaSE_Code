package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
//        System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add(1,"java");
        System.out.println(array);
    }
}
