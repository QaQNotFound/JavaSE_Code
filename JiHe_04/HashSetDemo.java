package JiHe_04;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王五", 19);
        Student student3 = new Student("王五", 19);
        hs.add(student);
        hs.add(student1);
        hs.add(student2);
        hs.add(student3);
        for (Student s : hs){
            System.out.println(s.getName()+s.getAge());
        }
    }
}
