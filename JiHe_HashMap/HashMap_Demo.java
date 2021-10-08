package JiHe_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<String,Student>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",22);
        Student s4 = new Student("赵六",17);
        hm.put("001",s1);
        hm.put("002",s2);
        hm.put("003",s3);
        hm.put("004",s4);

//        Set<String> keySet = hm.keySet();
//        for (String s : keySet){
//            Student v = hm.get(s);
//            System.out.println(s+v.getName()+v.getAge());
//        }
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for(Map.Entry<String,Student> me: entrySet){
            String k = me.getKey();
            Student v = me.getValue();
            System.out.println(k+v.getName()+v.getAge());
        }
    }
}
