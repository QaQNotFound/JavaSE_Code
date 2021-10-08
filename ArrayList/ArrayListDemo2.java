package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");arr.add("world");arr.add("java");arr.add("javase");arr.add("javaee");
//        System.out.println(arr);
//        System.out.println(arr.remove("java"));删除
//        arr.set(3,"javaSe");设置
//        String a = arr.get(3);获取
//        System.out.println(a);
        for(int i = 0; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
