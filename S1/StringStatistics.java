package S1;

import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        int n = 0, a = 0, A = 0, s = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                A++;
            }
            if (ch >= 'a' && ch <= 'z') {
                a++;
            }
            if (ch >= '0' && ch <= '9') {
                n++;
            }
            if(ch == ' '){
                s++;
            }
        }
        System.out.println("大写字母有" + A + "个");
        System.out.println("小写字母有" + a + "个");
        System.out.println("数字有" + n + "个");
        System.out.println("空格有"+s+"个");
    }
}
