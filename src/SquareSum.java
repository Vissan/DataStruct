import java.util.Scanner;

public class SquareSum {
    public boolean judgeSquareSum(int c) {
        for(long i = 0;i*i<=c;i++) {
            double b = Math.sqrt(c-Math.pow(i ,2));
            if(b==(int)b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SquareSum test = new SquareSum();
        Scanner in = new Scanner(System.in);
        if(test.judgeSquareSum(in.nextInt())) {
            System.out.println("It's true");
        }
        else {
            System.out.println("It's false");
        }
    }
}
