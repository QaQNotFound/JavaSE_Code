package Base;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("Please input one number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is prime");
        }
    }
}
