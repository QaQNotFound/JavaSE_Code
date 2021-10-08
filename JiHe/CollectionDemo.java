package JiHe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王五", 19);
        c.add(student);
        c.add(student1);
        c.add(student2);
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+s.getAge());
        }
    }
}
