package S1;

public class StringConect {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7};
        String s = ArrayToString(arr);
        System.out.println(s);
    }

    public static String ArrayToString(int a[]) {
        String s = new String();//等于String s = ”“；
        s += "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                s += a[i];
            } else {
                s += a[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
