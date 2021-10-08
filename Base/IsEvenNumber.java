package Base;

public class IsEvenNumber {
    public static void main(String[] args) {
        Even(85);
        System.out.println(Even(86));
        int x = 87;
        Even(x);
        System.out.println(Even(x));
        boolean ar = Even(x);
        System.out.println(ar);
    }
//    public static void Even(int number){
//        if(number%2==0){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//    }
    public static boolean Even(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}
