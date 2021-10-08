package S1;
import java.util.Scanner;
public class Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        //System.out.println(s.charAt(i));
        for(int i = 0; i < s.length(); i++){
            if(i == s.length()-1){
                System.out.println(s.charAt(i));
            }else{
                System.out.print(s.charAt(i) + ",");
            }
        }
    }
}
