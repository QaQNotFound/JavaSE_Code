package CatDog2;

import CatDog1.Animal;
import CatDog1.Cat;
import CatDog1.Dog;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
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
        Animal b = new CatDog1.Dog();
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
