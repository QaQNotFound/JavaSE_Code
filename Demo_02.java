import java.io.File;
import java.io.IOException;

public class Demo_02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:Java_Test");
        f1.mkdir();
        File f2 = new File(f1,"Demo1");
        f2.createNewFile();
        File f3 = new File("E:Java_Test\\Test1");
        f3.mkdirs();
        File f4 = new File(f3,"R1");
        f4.createNewFile();
        File f5 = new File(f3,"R2\\R3");
        f5.mkdirs();
        File f6 = new File(f5,"Test2");
        f6.createNewFile();
        File f7 = new File(f3,"R2\\Test3");
        f7.createNewFile();
        //以上为创建目录和文件
        getAllFilePath(f1);
    }
    public static void getAllFilePath(File srcFile){
        //获取给定主目录下的所有文件和目录的file数组
        File []fileArray = srcFile.listFiles();
        //遍历该file数组，得到每一个file对象
        if (fileArray!=null){
            for (File file :fileArray){
                //判断是否为目录
                if(file.isDirectory()){
                    //是，递归
                    getAllFilePath(file);
                }else {
                    //不是，输出绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
