package Demo_02_3;

public class JumppingOperator {
    public void useJumpping(Jumpping j){
        j.jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }
}
