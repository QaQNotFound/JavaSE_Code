package CatDog1;
//测试类
public class AnimalDemo1 {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");
        a = new Cat("汤姆",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");
        Animal b = new Dog();
        b.setName("柯基");
        b.setAge(3);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
        System.out.println("--------");
        b = new Dog("金毛",8);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
    }
}
