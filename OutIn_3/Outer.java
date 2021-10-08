package OutIn_3;

public class Outer {
    public void method(){
        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
    }
}
