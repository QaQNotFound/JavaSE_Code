package Base;
import java.util.Scanner;
import java.util.Random;
public class Guesting {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input one number");
            int guess = sc.nextInt();
            if(guess>n){
                System.out.println("Bigger");
            } else if(guess<n){
                System.out.println("Smaller");
            }else{
                System.out.println("You are right!");
                break;
            }
        }
    }
}
