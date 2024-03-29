package JiHe_05;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        int i = this.age - s.age; //age升序
//        int i = s.age - this.age; //age降序
        int i1 = i == 0 ? this.name.compareTo(s.name) : i;//age相同比name，age不同返回age
        return i1;
    }
}
