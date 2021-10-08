package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
    工具类
    构造方法私有：外部不能创造对象
    成员方法静态:可直接使用类名调用成员方法
 */
public class Utils {
    private Utils(){};
    //Date转String: return:String  parameter:Date data,String format
    public static String dataToString(Date data,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(data);
        return s;
    }
    //String转Data: return:Date parameter:String s,String format
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(s);
        return date;
    }
}
