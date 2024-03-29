package IO_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class demo {

    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum()-s1.getSum();
                int num2 = num==0?  s1.getChinese() - s2.getChinese(): num;
                int num3 = num2==0? s1.getMath() - s2.getMath(): num2;
                int num4 = num3==0? s1.getEnglish() - s2.getEnglish(): num3;
                int num5 = num4==0? s1.getName().compareTo(s2.getName()):num4;
                return num5;
            }
        });
        for (int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("请录入第"+(i+1)+"个学生信息：");
            System.out.print("姓名:");
            String name = sc.nextLine();
            System.out.print("语文：");
            int chinese = sc.nextInt();
            System.out.print("数学：");
            int math = sc.nextInt();
            System.out.print("英语:");
            int english = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            ts.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\bos.txt"));
        for (Student s :ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
