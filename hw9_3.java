import java.util.*;
public class hw9_3 {
    public static void main(String[] args) {
        Date date = new Date(0L); //选择1970年1月1日作为初始的Date对象，在其基础上进行毫秒的流逝
        System.out.println("初始时间为：" + date.toString());
        long []arr = {10000L,100000L,1000000L,10000000L,100000000L,1000000000L,10000000000L,100000000000L};
        for(int i = 0;i < 8;i++){
            long milliSecond = arr[i];
            date.setTime(milliSecond);
            System.out.println(milliSecond+"毫秒后，时间为："+date.toString());
        }
    }
}