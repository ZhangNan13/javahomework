import java.util.*;
public class hw7_10 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.print("请输入十个数字：");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 10;i++){
                arr[i] = input.nextDouble();//读取输入的数
        }
        System.out.println("数组为：");
        for (double e:arr) {
            System.out.print(e + " ");
        }
        System.out.print ("\n");
        int ind = indexOfSmallestElement(arr);
        System.out.println("最小元素的下标为：" + ind +" 其值为：" + arr[ind]);
    }
    public static int indexOfSmallestElement(double[] array){
        int ind = 0;
        double minarr = array[0];
        for (int j = 1;j < array.length;j++){
            if(array[j]<minarr) {
                minarr = array[j];
                ind = j;
            }
        }
        return ind;
    }
}
