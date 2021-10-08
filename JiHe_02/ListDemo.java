package JiHe_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王五", 19);
        list.add(student);
        list.add(student1);
        list.add(student2);
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s1 = it.next();
            System.out.println(s1.getName()+s1.getAge());
        }
        System.out.println("--------");
        for(int i = 0; i<list.size();i++){
            Student s2 = list.get(i);
            System.out.println(s2.getName()+s2.getAge());
        }
        System.out.println("--------");
        for (Student s3 : list){
            System.out.println(s3.getName()+s3.getAge());
        }
    }
}
