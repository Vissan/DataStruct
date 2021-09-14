import java.util.HashMap;
import java.util.Map;

public class numberOfBoomerangs {
    public int solution(int[][] points) {
        int res = 0;
        for (int[] p : points) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] q : points) {
                int dist = (p[0]-q[0])*(p[0]-q[0])+(p[1]-q[1])*(p[1]-q[1]);
                map.put(dist, map.getOrDefault(dist, 0)+1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int m = entry.getValue();
                res += m*(m-1);
            }
        }
        return res;
    }
}
