package Base;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        chang(number);
        System.out.println(number);
        int t = chang(number);
        System.out.println(t);
        int arr[] = {10,20,30};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int b[]){
        b[1] = 200;
    }
    public static int chang(int number){
        number = 200;
        return number;
    }
}
