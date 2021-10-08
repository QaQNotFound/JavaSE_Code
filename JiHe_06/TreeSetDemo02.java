package JiHe_06;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this.age - s.age
                //s1        ,s2
                int i = s1.getAge()- s2.getAge();
                int i1 = i==0?s1.getName().compareTo(s2.getName()):i;
                return i1;
            }
        });
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王五", 19);
        Student student3 = new Student("陈六", 21);
        Student student4 = new Student("安一", 21);
        Student student5 = new Student("陈六", 21);
        ts.add(student);
        ts.add(student1);
        ts.add(student2);
        ts.add(student3);
        ts.add(student4);
        ts.add(student5);
        for (Student s : ts){
            System.out.println(s.getName()+s.getAge());
        }
    }
}
