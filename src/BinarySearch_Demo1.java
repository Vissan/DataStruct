import java.util.Arrays;
import java.util.OptionalInt;

public class BinarySearch_Demo1 {
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt(); //左边界最小运量
        int right = Arrays.stream(weights).sum(); //右边界最大运量
        while(left<right) {
            int need = 1;
            int current = 0;
            int middle = (left + right)/2;
            for (int weight : weights) {
                if(current + weight>middle) {
                    need++;
                    current = 0;
                }
                current += weight;
            }
            if(need<=D) {
                right = middle;
            }
            else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        BinarySearch_Demo1 test = new BinarySearch_Demo1();
        System.out.println(test.shipWithinDays(a, D));
    }
}
