package JiHe_HashMap_01;

import java.util.HashMap;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student,String >();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",22);
        Student s4 = new Student("王五",22);
        hm.put(s1,"北京");
        hm.put(s2,"上海");
        hm.put(s3,"广州");
        hm.put(s4,"深圳");
        Set<Student> keySet = hm.keySet();
        for (Student s :keySet){
            String v = hm.get(s);
            System.out.println(s.getName()+s.getAge()+v);
        }
    }
}
