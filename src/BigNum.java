import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
//        BigInteger[] f = new BigInteger[5000];
//        f[1] = new BigInteger("1");
//        f[2] = new BigInteger("1");
//        for(int i=3;i<=200;i++) {
//            f[i] = f[i-1].add(f[i-2]);
//        }
//        Scanner cin = new Scanner(System.in);
//        int j = cin.nextInt();
//        while (j>0) {
//            System.out.println(f[j]);
//            j--;
//        }

        BigInteger a;
        Scanner in = new Scanner(System.in);
        a = in.nextBigInteger();
        String b = a.toString();
        System.out.println(b);
        int i = 0;
        int count = 0;
        while (i<b.length()) {
            char ch = b.charAt(i);
            if(ch=='0') {
                count++;
            }
            i++;
        }
        System.out.println("The number is +"+count);
    }
}
