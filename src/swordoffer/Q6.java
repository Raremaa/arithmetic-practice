package swordoffer;

/**
 * @author masaiqi
 * @date 2020/3/15 3:12 下午
 */
public class Q6 {


    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     * 主要利用 n&(n-1) 的特性 ： 去除 n 的位级表示中最低的那一位。
     */

    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }

    public int NumberOf2(int n) {
        return Integer.bitCount(n);
    }
}
