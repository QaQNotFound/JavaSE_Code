package Base;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Max();
    }
    public static void Max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个人的身高：");
        int x = sc.nextInt();
        System.out.println("第二个人的身高");
        int y = sc.nextInt();
        System.out.println("第三个人的身高");
        int z = sc.nextInt();
        int t = (x<y)?x:y ;
        int min =(t<z)?t:z;
        System.out.println("min:" + min);
    }
}

