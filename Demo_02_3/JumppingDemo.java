package Demo_02_3;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo =new JumppingOperator();
        Jumpping j1 = new Cat();
        jo.useJumpping(j1);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
