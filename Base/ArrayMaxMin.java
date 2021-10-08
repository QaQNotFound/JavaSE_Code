package Base;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr[] = {19,15,58,64,18};
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
