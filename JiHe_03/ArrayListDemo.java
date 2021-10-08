package JiHe_03;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王五", 19);
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        for(Student s : arrayList){
            System.out.println(s.getName()+s.getAge());
        }
        System.out.println("---");
        for (int i = 0;i < arrayList.size();i++){
            Student s = arrayList.get(i);
            System.out.println(s.getName()+s.getAge());
        }
        System.out.println("---");
        Iterator<Student> it = arrayList.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+s.getAge());
        }
    }
}
