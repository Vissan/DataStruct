public class TwoKey {
    public int minSteps(int n) {
        int sum = 0;
        if(n%2==0) {
            while (n!=0) {
                n /= 2;
                sum++;
            }
            return sum;
        }
        if(n%2==1) {
            n -= 1;
            while (n!=0) {
                n /= 2;
                sum++;
            }
            return sum+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoKey test = new TwoKey();
        System.out.println(test.minSteps(10));
    }
}
