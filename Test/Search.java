package Test;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        int arr[] = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = -1;
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==num){
                x=i;
                break;
            }
            }
        System.out.println(x);
        }
    }
