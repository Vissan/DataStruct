public class ArrayXOR_Two {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ret = new int[10];
        int i=0;
        while(queries[i]!=null) {
            int m = queries[i][0];
            int n = queries[i][1];
            int temp = m;
            for(int k=m;k<=n;k++) {
                temp = temp^k;
            }
            ret[i] = temp;
            i++;
        }
        return ret;
    }
}
