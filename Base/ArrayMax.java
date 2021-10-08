package Base;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[] = {11,587,265,1584,153,15};
        max(arr);
        System.out.println(max(arr));
    }
    public static int max(int b[]){
        int m = b[0];
        for(int x = 1 ; x < b.length ; x++){
            if(b[x]>m){
                m = b[x];
            }
        }
        return m;
    }
}
