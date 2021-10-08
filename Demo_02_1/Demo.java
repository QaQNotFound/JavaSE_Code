package Demo_02_1;

public class Demo {
    public static void main(String[] args) {
        CatOperater co = new CatOperater();

        Cat c1 = new Cat();
        co.useCat(c1);

        Cat c2 = co.getCat();// Cat c2 = new Cat(); c2 = co.getCat();
        c2.eat();
    }
}
