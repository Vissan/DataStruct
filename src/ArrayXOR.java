import java.util.ArrayList;
import java.util.List;

public class ArrayXOR {
    public int xorOperation(int n, int start) {
        int ret = start;
        for(int i=1;i<n;i++) {
            ret ^= (start+i*2);
        }
        return ret;
    }

    public static void main(String[] args) {
        ArrayXOR test = new ArrayXOR();
        System.out.println(test.xorOperation(5, 0));
    }
}
