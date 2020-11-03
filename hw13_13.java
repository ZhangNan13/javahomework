import java.util.*;
import java.lang.Cloneable;
import java.lang.String;
public class hw13_13 {
    public static void main(String[] args) {
        //创建Course实例c1验证函数
        Course c1 = new Course("Java");
        for(int i = 0; i < 20; i++){
            c1.addStudent(i+"");
        }
        System.out.println("Course实例c1为：");
        String c1_name = c1.getCourseName();
        int c1_sn = c1.getNumberOfStudents();
        String[] c1_s = c1.getStudents();
        System.out.println("课程：" + c1_name);
        System.out.println("学生数为：" + c1_sn);
        System.out.println("学生名为：" + Arrays.toString(c1_s));
        System.out.println("对c1进行克隆，得到c2：");
        Course c2 = (Course)c1.clone();
        String c2_name = c2.getCourseName();
        int c2_sn = c2.getNumberOfStudents();
        String[] c2_s = c2.getStudents();
        System.out.println("课程：" + c2_name);
        System.out.println("学生数为：" + c2_sn);
        System.out.println("学生名为：" + Arrays.toString(c2_s));
        System.out.println("判断是否深度复制");
        System.out.println("c1.students==c2.students：" + (c1_s == c2_s));
        c1.dropStudent("12"); //删去c1中名为12的学生
        System.out.println("删去c1中学生后，c1与c2分别为：");
        c1_sn = c1.getNumberOfStudents();
        c1_s = c1.getStudents();
        c2_sn = c2.getNumberOfStudents();
        c2_s = c2.getStudents();
        System.out.println("课程：" + c1_name);
        System.out.println("学生数为：" + c1_sn);
        System.out.println("学生名为：" + Arrays.toString(c1_s));
        System.out.println("课程：" + c2_name);
        System.out.println("学生数为：" + c2_sn);
        System.out.println("学生名为：" + Arrays.toString(c2_s));
    }
}
//Course类
class Course implements Cloneable{
    private final String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){ //删去指定姓名的学生
        String[] students1 = new String[100];
        int numberOfStudents2 = 0;
        for(int i = 0; i < numberOfStudents; i++){
            if(!students[i].equals(student)){
                students1[numberOfStudents2] = students[i];
                numberOfStudents2++;
            }
        }
        students = students1;
        numberOfStudents = numberOfStudents2;
    }
    @Override
    public Object clone(){
        try{
            Course courseClone = (Course)super.clone();
            courseClone.students = (java.lang.String[])students.clone();
            return courseClone;
        }catch (CloneNotSupportedException ex){
            return null;
        }
    }
}