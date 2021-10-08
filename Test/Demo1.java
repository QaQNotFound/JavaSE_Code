package Test;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("run");
                break;
            case 2:
                System.out.println("run");
                break;
            case 3:
                System.out.println("run");
                break;
            case 4:
                System.out.println("run");
                break;
            case 5:
                System.out.println("run");
                break;
            case 6:
                System.out.println("run");
                break;
            case 7:
                System.out.println("run");
                break;
            default:
                System.out.println("Error");
        }
    }
}
