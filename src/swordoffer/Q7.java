package swordoffer;

/**
 * @author masaiqi
 * @date 2020/3/16 6:22 下午
 */
public class Q7 {

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     * 保证base和exponent不同时为0
     */

    public static double power(double base, int exponent) {
        double result = 1;
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println(power(2, 0));
    }
}
