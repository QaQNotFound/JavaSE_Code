package OutIn_2;

public class Out {
    private int num = 10;
    public void method(){
        class In{
            int n = 2;
            public void show(){
                System.out.println(num);
                System.out.println(n);
            }
        }

        In i =new In();
        i.show();
    }
}
