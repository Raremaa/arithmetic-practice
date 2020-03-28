package swordoffer;


/**
 * @author masaiqi
 * @date 2020/3/27 10:22 上午
 */
public class Q14 {

    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        int cursor = 0;

        int[] res = new int[(right + 1) * (down + 1)];
        while (true) {
            for (int i = left; i <= right; i++) {
                res[cursor++] = matrix[up][i];
            }
            if (++up > down) {
                break;
            }

            for (int i = up; i <= down; i++) {
                res[cursor++] = matrix[i][right];
            }
            if (--right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res[cursor++] = matrix[down][i];
            }
            if (--down < up) {
                break;
            }

            for (int i = down; i >= up; i--) {
                res[cursor++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }

}
