package Base;
import java.util.Random;
public class Ra {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=1;i<=10;i++){
            int r1 = r.nextInt(10);
            System.out.println(r1);
        }
    }
}
