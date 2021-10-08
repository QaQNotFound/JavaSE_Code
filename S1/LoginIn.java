package S1;

import java.util.Scanner;

public class LoginIn {
    public static void main(String[] args) {
        //自定义两个字符串，即题目中的已知的用户名和密码
        String username = "zhangsan";
        String password = "123";
        //创建输入对象
        Scanner sc = new Scanner(System.in);
        //总共三次机会，因为知道总次数，因此适合使用for循环语句
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            //使用equals方法判断输入的内容与给定的内容是否相同，相同则登录成功并用break结束循环，不相同则继续循环
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                //为什么是2-i: i从 0 1 2开始,第一次i=0，共三次，剩2次;第二次i=1,共三次，剩1次；第三次i=2，共三次，剩0次；每次i的值和剩余次数的值的和均为2
                if (2 - i == 0) {
                    System.out.println("您的账户已锁定，请与管理员联系");
                } else {
                    System.out.println("登录失败，您还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
