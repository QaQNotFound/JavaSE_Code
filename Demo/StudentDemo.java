package Demo;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Jack");
        st.setAge(18);
        st.show();

        System.out.println(st.getName() + "," + st.getAge());
    }
}
