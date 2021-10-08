package Student;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("a");
        s1.setAge(10);

        Student s2 = new Student();
        s2.setName("a");
        s2.setAge(10);
        System.out.println(s1.equals(s2));
    }
}
