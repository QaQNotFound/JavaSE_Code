package CatDog3;

public class Demo {
    public static void main(String[] args) {
        Animal c = new Cat();
        Jumpping ca = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        ca.jump();
        System.out.println("---------");
        Dog d = new Dog("柯基",5);//具体的子类或具体类
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.jump();
    }
}
