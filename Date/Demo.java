package Date;

import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = Utils.dataToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2 = Utils.dataToString(d, "yyyy年MM月dd日");
        System.out.println(s2);
        String s3 = Utils.dataToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------------------------");
        String s4 = "2016-4-20 16:54:21";
        Date date = Utils.stringToDate(s4, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
    }
}
