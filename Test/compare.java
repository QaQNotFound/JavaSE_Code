package Test;

public class compare {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55};
        int arr2[] = {11,22,33,55,44};
        boolean a = Ar(arr,arr2);
        System.out.println(a);
    }
    public static boolean Ar(int arr[],int arr2[]){
        if(arr.length != arr2.length){
            return false;
        }
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
