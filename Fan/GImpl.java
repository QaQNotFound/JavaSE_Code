package Fan;

public class GImpl<T> implements G<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
