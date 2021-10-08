package OuterInner;


public class Demo {
    public static void main(String[] args) {
        Out.Inner oi =new Out().new Inner();
        oi.show();

        Out o = new Out();
        o.meth();
    }
}
