package OuterInner;

public class Out {
    private int num = 10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }


    private class In{
        public void show(){
            System.out.println(num+10);
        }
    }
    public void meth(){
        In i = new In();
        i.show();
    }
}
