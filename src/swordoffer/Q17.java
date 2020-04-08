package swordoffer;

/**
 * @author masaiqi
 * @date 2020/4/8 6:56 下午
 */
public class Q17 {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     * <p>
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     * <p>
     * 示例 1：
     * <p>
     * 输入：n = 2
     * 输出：2
     * <p>
     * 示例 2：
     * <p>
     * 输入：n = 7
     * 输出：21
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 动态规划求解
     * <p>
     * 最后一步有两种可能，为1或为2，则：
     * 如果最后跳1级，则有f(n-1)种
     * 如果最后跳2级，则有f(n-2)种
     * <p>
     * 因此，得到状态回归方程：
     * f(n) = f(n-1) + f(n-2)
     * <p>
     * 接下来做法同斐波那契数列的做法
     * 注意，求余运算规则：
     * 设正整数 x,y,p ，求余符号为 % ，则有 (x+y)%p=(x%p+y%p)%p
     */
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = (b + a) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
