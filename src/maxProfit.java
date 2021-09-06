import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class maxProfit {
    /**
     * O(m*m) 暴力解法不可取
     * @param prices
     * @return
     */
    public int solution(int[] prices) {
        int maxprofit = 0;
        for (int i=0; i<prices.length-1; i++) {
            for (int j=i+1; j<prices.length; j++) {
                maxprofit = Math.max(maxprofit, prices[j]-prices[i]);
            }
        }
        return maxprofit;
    }

    @Test
    public void test() {
        maxProfit test = new maxProfit();
        int[] nums = {7,1,5,3,6,4};
        System.out.println(test.solution2(nums));
    }

    /**
     * 贪心算法，从局部最优解到总体最优解
     * @param prices
     * @return
     */
    public int solution2(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i=1; i<prices.length; i++) {
            minprice = Math.min(minprice, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i]-minprice);
        }
        return maxprofit;
    }
}
