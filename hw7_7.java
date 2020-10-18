import java.util.Random;
public class hw7_7 {
    public static void main(String[] args) {
        //测试函数
        int[] arr = CreateRandomarr(100,0,9);//生成100个0-9的随机数
        unitCount(arr);//统计个位数
    }
    public static int[] CreateRandomarr(int n,int minnum,int maxnum) {
        int[] arr = new int[n]; //生成长度为n的空数组
        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(maxnum - minnum + 1) + minnum; //生成指定范围的随机数
        }
        return arr;
    }
    public static void unitCount(int[] arr) {
        int[] count1 = new int[10]; //生成数组存储0-9的数的个数
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i]; //遍历数组arr并计算个位数个数
            count1[num]++;
        }
        for(int j = 0; j < 10; j++) {
            System.out.println("个位数"+ j + "出现次数为：" + count1[j]);
        }
    }
}
