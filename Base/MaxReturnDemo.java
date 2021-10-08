package Base;

public class MaxReturnDemo {
    public static void main(String[] args) {
//        int i = 4;int j = 3;
//        int c = max(i,j);
        System.out.println(max(4,3));

    }
    public static int max (int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
