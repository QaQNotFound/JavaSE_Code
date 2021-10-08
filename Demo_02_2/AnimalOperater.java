package Demo_02_2;

public class AnimalOperater {
    public void useAnimal(Animal a){
        a.eat();
    }

    public Animal getAnimal(){
        Animal a =new Cat();
        return a;
    }
}
