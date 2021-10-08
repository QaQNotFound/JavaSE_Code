package OutIn_04;

public class Demo {
    public static void main(String[] args) {
        JummpingOperator jo =new JummpingOperator();
        Jumpping j =new Cat();
        jo.method(j);

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("Dog can jump");
            }
        });
    }
}
