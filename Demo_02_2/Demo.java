package Demo_02_2;

public class Demo {
    public static void main(String[] args) {
        //创建操作类对象并调用方法
        AnimalOperater ao = new AnimalOperater();

        Animal a1 = new Cat();
        ao.useAnimal(a1);
//        a1.eat();

        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
