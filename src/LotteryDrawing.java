import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("输入你想要拥有用的数组长度");
        int n = in.nextInt();

        System.out.println("输入你想获得的数字数量");
        int k = in.nextInt();

        //创建一个数组
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);//r的范围是 [0,n-1]
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("数字如下");
        for(int r : result) {
            System.out.println(r);
        }
    }
}
