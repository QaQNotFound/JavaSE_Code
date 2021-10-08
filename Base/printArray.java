package Base;

public class printArray {
    public static void main(String[] args) {
        int arr[] = {11,58,64,34,75,78};
        print(arr);
    }
    public static void print(int []a){
        for (int x = 0;x < a.length;x++){
            if(x == a.length-1){
                System.out.println(a[x]);
            }else{
                System.out.print(a[x]+",");
            }
        }
    }
}
