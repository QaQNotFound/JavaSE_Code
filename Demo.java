import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test//fos.txt");
//        byte []bys = new byte[5];
//        int len = fis.read(bys);
////        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));
//        len = fis.read(bys);
//        System.out.println(new String(bys,0,len));
//        len = fis.read(bys);
//        System.out.println(new String(bys,0,len));
//        len = fis.read(bys);
//        System.out.println(new String(bys,0,len));
        byte[] bys = new byte[1024];//一般为1024及其整数位
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        fis.close();
    }
}