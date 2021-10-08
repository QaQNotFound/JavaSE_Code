package JiHe_07;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getSum()-s2.getSum();//sum优先
                int i1 = i==0?s1.getChinese()- s2.getChinese():i;//sum相同,chinese优先
                int i2 = i1==0?s1.getName().compareTo(s2.getName()):i1;//sum,chinese相同,name优先
                return i2;
            }
        });
    }
}
