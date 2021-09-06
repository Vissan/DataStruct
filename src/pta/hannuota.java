package pta;
import java.util.Scanner;
import java.math.*;

public class hannuota {
    /**
     * 一共走了多少步
     */
    static int times;

    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
//        System.out.println("汉诺塔游戏开始啦");
//        System.out.println("请输入盘子数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //调用汉诺塔
        hannoi(n, A, B, C);
        System.out.println((int)(Math.pow(2, n)-1));
        s.close();

    }
    /**
     * 盘子移动
     * @param disk
     * @param M
     * @param N
     */
    /*
    将disk从M移动到N
     */
    public static void move(int disk, int M, int N ){
        System.out.println(disk+" " + M+ " " + N);
    }


    public static void hannoi(int n, int A, int B, int C){
        if(n == 1){
            move(n, A, C);
        }else{
            //移动上一关的步骤移动到B
            hannoi(n - 1, A, C, B);
            //把最大的盘子移动C塔
            move(n, A, C);
            //再把B上的上一关的盘子移动到C上就可以了
            hannoi(n - 1, B, A, C);

        }
    }
}