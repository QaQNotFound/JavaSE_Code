package Demo;

public class Student {
    private String name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>120 || age<0){
            System.out.println("Input Error");
        }else{
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(name + ",," +age);
    }
}
