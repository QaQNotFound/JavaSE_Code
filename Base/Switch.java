package Base;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input one month:");
        int month = sc.nextInt();
        switch (month){
            case 12:
            case 2:
            case 1:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Input Error");
        }

//        switch (month) {
//            case 12:
//                System.out.println("Winter");
//                break;
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 1:
//                System.out.println("Winter");
//                break;
//        }
    }
}
